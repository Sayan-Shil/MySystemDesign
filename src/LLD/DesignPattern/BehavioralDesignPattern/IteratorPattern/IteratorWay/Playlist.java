package LLD.DesignPattern.BehavioralDesignPattern.IteratorPattern.IteratorWay;


import java.util.ArrayList;
import java.util.List;

public class Playlist {
  public List<Song> songList ;

  public Playlist(){
      this.songList = new ArrayList<>();
  }

    public void addSong(Song song) {
        songList.add(song);
    }
    public void removeSong(Song song) {
        songList.remove(song);
    }
    public PlaylistIterator<Song>  playlistIterator(String type){
      return switch(type.toLowerCase()){
          case "simple" -> new SimpleSongPlaylistIterator(this);
          case "shuffle" -> new ShuffleSongPlaylistIterator(this);
          case "favorite" -> new FavouriteSongPlaylistIterator(this);
          default -> null;
      };
    }

    public void playPlaylist(String type){
      PlaylistIterator<Song> playlistIterator = playlistIterator(type);
      if(playlistIterator == null){
          playlistIterator=new SimpleSongPlaylistIterator(this);
      }
      while(playlistIterator.hasNext()){
          playlistIterator.next().play();
      }
    }


}
