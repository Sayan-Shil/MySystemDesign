package LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Subscriber;

public class SMSSubscriber implements Subscriber {
    String phone;
    public SMSSubscriber(String phone) {
        this.phone = phone;
    }

    @Override
    public void notifySubscriber(String content) {
        System.out.printf("SMS Notification has been sent to +91 %s , Here is content : %s%n", phone, content);
    }
}
