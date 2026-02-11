package LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Subscriber;

public class YouTubeSubscriber implements Subscriber {
    String name;
    public YouTubeSubscriber(String name) {
        this.name = name;
    }
    @Override
    public void notifySubscriber(String content) {
        System.out.printf("Youtube Notification sent to %s , Here is content : %s %n", name, content);
    }
}
