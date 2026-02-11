package LLD.DesignPattern.BehavioralDesignPattern.IteratorPattern.IteratorWay;


public class SimpleSongPlaylistIterator implements PlaylistIterator<Song> {
    private Playlist playlist;
    int index;
    public SimpleSongPlaylistIterator(Playlist playlist){
        this.playlist = playlist;
        this.index = 0;
    }
    @Override
    public boolean hasNext() {
        return index < playlist.songList.size();
    }

    @Override
    public Song next() {
       return playlist.songList.get(index++);
    }
}
