package LLD.DesignPattern.CreationalDesignPattern.BuilderPattern.TraditionalWay;

import java.time.LocalDateTime;
import java.util.UUID;

public class Post {

    private final UUID id = UUID.randomUUID();
    private String title;
    private String description;
    private String imageUrl;
    private LocalDateTime postedOn;

    {
        this.postedOn = LocalDateTime.now();
    }

    // Two redundant codes
    public Post(String title, String description) {
        this.title = title;
        this.description = description;
    }
    public Post(String title, String description, String imageUrl) {
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
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

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

   public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
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

