package LLD.DesignPattern.BehavioralDesignPattern.IteratorPattern.TraditionalWay;


public class Song {

    private String name;
    private String lyrics;
    private long duration;

    public Song(String name) {
        this.name = name;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void play(){
        System.out.printf("🎶Playing %s Song: \n%s\n\n\n ", name, lyrics);
    }
}
