package LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Channel;

import LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Subscriber.Subscriber;

public interface Channel {
     void addSubscriber(Subscriber subscriber);
     void removeSubscriber(Subscriber subscriber);
     void uploadContent(String content);
}
