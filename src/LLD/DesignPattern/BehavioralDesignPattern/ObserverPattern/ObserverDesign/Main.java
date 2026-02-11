package LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign;

import LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Channel.Channel;
import LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Channel.YouTubeChannel;
import LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Subscriber.EmailSubscriber;
import LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Subscriber.SMSSubscriber;
import LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Subscriber.Subscriber;
import LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.ObserverDesign.Subscriber.YouTubeSubscriber;

public class Main {
    static void main() {
        Channel nxionPlayz = new YouTubeChannel();
        Subscriber mailSubscriber = new EmailSubscriber("sayansil2000@gmail.com");
        Subscriber smsSubscriber = new SMSSubscriber("1234567891");
        Subscriber youtubeSubscriber = new YouTubeSubscriber("NXion Playz");

        nxionPlayz.addSubscriber(mailSubscriber);
        nxionPlayz.addSubscriber(smsSubscriber);
        nxionPlayz.addSubscriber(youtubeSubscriber);

        String video = "One Shot: How to crack NEET ?";
        nxionPlayz.uploadContent(video);

    }
}
