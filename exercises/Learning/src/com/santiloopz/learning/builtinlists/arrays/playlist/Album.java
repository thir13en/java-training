package com.santiloopz.learning.builtinlists.arrays.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songList;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songList = new SongList();
    }

    public boolean addSong(String title, double duration) {
        Song newSong = new Song(title, duration);
        return this.songList.add(newSong);
    }

    private Song findSong(String title) {
        return songList.findSong(title);
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song foundSong = songList.findSong(trackNumber);

        if (foundSong == null) {
            return false;
        }

        playlist.add(foundSong);
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song songToAdd = this.songList.findSong(songTitle);

        if (songToAdd == null) {
            return false;
        }

        playlist.add(songToAdd);
        return true;
    }

    class SongList {
        private ArrayList<Song> songs;

        public SongList () {
            this.songs = new ArrayList<Song>();
        }

        public boolean add(Song song) {
            Song foundSong = findSong(song.getTitle());
            if (foundSong != null) {
                return false;
            }
            songs.add(song);
            return true;
        }

        Song findSong(String title) {
            Song songToAdd = null;

            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    songToAdd = song;
                    break;
                }
            }

            return songToAdd;
        }

        Song findSong(int trackNumber) {
            if (trackNumber >= 0 && trackNumber < songs.size()) {
                return songs.get(trackNumber);
            }

            return null;
        }
    }
}
