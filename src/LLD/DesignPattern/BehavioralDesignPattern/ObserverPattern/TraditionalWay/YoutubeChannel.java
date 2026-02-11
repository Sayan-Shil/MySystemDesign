package LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.TraditionalWay;

import LLD.DesignPattern.BehavioralDesignPattern.StrategyPattern.StrategyDesign.PaymentStrategy;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<String> subscribedChannels =  new ArrayList<String>();
    public String video;

    public void addSubscribedChannel(String subscribedChannel) {
        System.out.println("New Subscriber :  " + subscribedChannel );
        subscribedChannels.add(subscribedChannel);
    }
    public void removeSubscribedChannel(String subscribedChannel) {
        subscribedChannels.remove(subscribedChannel);
    }
    public void uploadVideo(String video) {
        this.video = video;
        notifySubscriber(video);
    }

    private void notifySubscriber(String video) {
        for(String subscribedChannel : subscribedChannels) {
            System.out.println("Hey,"+subscribedChannel+ "Notification via Youtube : " +video);
        }
    }
}
