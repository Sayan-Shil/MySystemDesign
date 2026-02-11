package LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Subscriber;

public class EmailSubscriber implements Subscriber {
    String email;
    public EmailSubscriber(String email) {
        this.email = email;
    }
    @Override
    public void notifySubscriber(String content) {
        System.out.printf("Email Notification has been sent to %s , Here is content : %s%n", email, content);
    }
}
