package LLD.DesignPattern.BehavioralDesignPattern.IteratorPattern.IteratorWay;


public class Song {

    private String name;
    private String lyrics;
    private long duration;
    private boolean isFavourite;

    public Song(String name) {
        this.name = name;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }
    public void setDuration(long duration) {
        this.duration = duration;
    }
    public void setFavourite() {
        this.isFavourite = true;
    }
    public boolean isFavourite() {return isFavourite;}

    public void play(){
        System.out.printf("🎶Playing %s Song: \n%s\n\n\n ", name, lyrics);
    }
}
