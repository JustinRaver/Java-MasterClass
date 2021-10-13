package exercises.PlaylistInnerClasses;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private final String name;
    private final String artist;
    private final SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        Song s = songs.findSong(title);

        if (s == null) {
            songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNum, LinkedList<Song> list) {
        if (trackNum > songs.songs.size() || trackNum < 1) {
            return false;
        }

        Song s = songs.songs.get(trackNum - 1);

        list.add(s);
        return true;
    }

    public boolean addToPlayList(String song, LinkedList<Song> list) {
        Song s = songs.findSong(song);

        if (s == null) return false;

        list.add(s);
        return true;
    }

    public static class SongList {
        private final ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song s) {
            if (findSong(s.getTitle()) == null) {
                songs.add(s);
                return true;
            }
            return false;
        }

        private Song findSong(String title) {
            for (Song s : songs) {
                if (s.getTitle().equals(title)) {
                    return s;
                }
            }
            return null;
        }

        private Song findSong(int trackNum) {
            trackNum--;
            if (trackNum >= 0 && trackNum < songs.size()) {
                return songs.get(trackNum);
            }
            return null;
        }
    }

}