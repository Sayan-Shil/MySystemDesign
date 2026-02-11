package LLD.DesignPattern.BehavioralDesignPattern.ObserverPattern.TraditionalWay;

public class Main {
    static void main() {
        YoutubeChannel youtubeChannel = new YoutubeChannel();
        youtubeChannel.addSubscribedChannel("Sayan Shil");
        youtubeChannel.addSubscribedChannel("Bibek Barik");
        youtubeChannel.addSubscribedChannel("Arpan Dey");
        String video = "How to lower stress of exam";
        youtubeChannel.uploadVideo(video);
    }
}
