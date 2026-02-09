package LLD.DesignPattern.CreationalDesignPattern.BuilderPattern.BuilderDesign;

import java.time.LocalDateTime;
import java.util.UUID;

public class Post {
    private final UUID id =  UUID.randomUUID();
    private String title;
    private String description;
    private String imageUrl;
    private LocalDateTime postedOn;

    private Post(PostBuilder builder){
        this.title = builder.title;
        this.description = builder.description;
        this.imageUrl = builder.imageUrl;
        this.postedOn= LocalDateTime.now();
    }

    public static PostBuilder builder() {
        return new PostBuilder();
    }

    static class PostBuilder {
        private String title;
        private String description;
        private String imageUrl;

        //Setters
        public PostBuilder  title(String title) {
            this.title = title;
            return this;
        }
        public PostBuilder description(String description) {
            this.description = description;
            return this;
        }
        public PostBuilder imageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }

        public Post build() {
            return new Post(this);
        }

    }

    // Getters
    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getPostedOn() {
        return postedOn;
    }
    public String getImageUrl() {
        return imageUrl;
    }


    @Override
    public String toString() {
        return """
                {
                id : %s ,
                title : %s ,
                description : %s ,
                imageUrl : %s ,
                postedOn : %s                
                }
               
                """.formatted(id.toString(), title, description, imageUrl, postedOn.toString());
    }


}
