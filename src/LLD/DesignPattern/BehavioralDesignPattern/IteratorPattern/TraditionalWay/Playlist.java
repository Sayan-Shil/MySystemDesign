package LLD.DesignPattern.BehavioralDesignPattern.IteratorPattern.TraditionalWay;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private final List<Song> songList = new ArrayList<>();

    public void addSong(Song song) {
        songList.add(song);
    }
    public void removeSong(Song song) {
        songList.remove(song);
    }

    public void playPlaylist(){
        for (int i = 0; i < songList.size() ; i++) {
            Song song = songList.get(i);
            song.play();
        }
    }
}
