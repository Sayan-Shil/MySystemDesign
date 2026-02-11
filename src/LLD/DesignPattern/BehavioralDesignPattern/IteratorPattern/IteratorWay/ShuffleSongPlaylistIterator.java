package LLD.DesignPattern.BehavioralDesignPattern.IteratorPattern.IteratorWay;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ShuffleSongPlaylistIterator implements PlaylistIterator<Song> {
    private Playlist playlist;
    List<Song> songList;
    int index;
    public ShuffleSongPlaylistIterator(Playlist playlist){
        this.playlist = playlist;
        this.songList = playlist.songList;
        Collections.shuffle(songList);
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < this.songList.size();
    }

    @Override
    public Song next() {
        return this.songList.get(index++);
    }
}
