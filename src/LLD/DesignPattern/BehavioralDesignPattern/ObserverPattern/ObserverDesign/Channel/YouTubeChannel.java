package LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Channel;

import LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Channel{
    private List<Subscriber> subscribers =  new ArrayList<>();
    public String content;
    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    @Override
    public void uploadContent(String content) {
        this.content = content;
        subscribers.forEach(subscriber -> subscriber.notifySubscriber(content));
    }
}
