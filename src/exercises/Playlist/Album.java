package exercises.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name,artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration){
        Song s = findSong(title);

        if(s == null){
            songs.add(new Song(title,duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for(Song s:songs){
            if(s.getTitle().equals(title)){
                return s;
            }
        }
        return null;
    }
    public boolean addToPlayList(int trackNum, LinkedList<Song> list){

        System.out.println(songs);
        System.out.println(trackNum-1);

        if(trackNum > songs.size() || trackNum < 1){
            return false;
        }

        Song s = songs.get(trackNum-1);

        list.add(s);
        return true;
    }

    public boolean addToPlayList(String song, LinkedList<Song> list){
        Song s = findSong(song);

        if(s == null) return false;

        list.add(s);
        return true;
    }


}