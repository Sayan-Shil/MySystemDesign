package LLD.DesignPattern.CreationalDesignPattern.BuilderPattern.BuilderDesign;

public class Main {
    static void main() {

        Post post1 = Post.builder()
                .title("Good Night Post")
                .description("Kya hi kar lega tu, so ja !")
                .build();
        Post post2 = Post.builder()
                .imageUrl("www.dev.com")
                .build();

        System.out.println(post1);
        System.out.println(post2);

    }
}
