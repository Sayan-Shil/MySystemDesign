package LLD.DesignPattern.CreationalDesignPattern.BuilderPattern.TraditionalWay;

public class Main {
    static void main() {
        Post post =  new Post("Good Morning", "Good Morning Bhai Log, Jaldi Uth jao , Brush Karo");
        Post post2 =  new Post("Good Morning", "Good Morning Bhai Log, Jaldi Uth jao , Brush Karo","www.morningpost.image.com");
        System.out.println(post);
        System.out.println(post2);
    }
}
