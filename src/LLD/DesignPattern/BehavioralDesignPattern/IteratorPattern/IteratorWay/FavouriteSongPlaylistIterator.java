package LLD.DesignPattern.BehavioralDesignPattern.IteratorPattern.IteratorWay;

import java.util.NoSuchElementException;

public class FavouriteSongPlaylistIterator implements PlaylistIterator<Song> {
    private Playlist playlist;
    int index;
    FavouriteSongPlaylistIterator(Playlist playlist)
    {
        this.playlist = playlist;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        while(index<playlist.songList.size()) {
            if (playlist.songList.get(index).isFavourite()) {
                return true;
            }
            index++;
        }
        return false;
    }

    @Override
    public Song next() {
        while(index < playlist.songList.size()) {
            Song song = playlist.songList.get(index++);
            if(song.isFavourite()) {
                return song;
            }
        }
        throw new NoSuchElementException();
    }


}
