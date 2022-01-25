package com.santiloopz.learning.builtinlists.arrays.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        Song newSong = new Song(title, duration);
        return songs.add(newSong);
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        Song foundSong = songs.findSong(trackNumber);

        if (foundSong == null) {
            return false;
        }

        playlist.add(foundSong);
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song songToAdd = songs.findSong(songTitle);

        if (songToAdd == null) {
            return false;
        }

        playlist.add(songToAdd);
        return true;
    }

    static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            Song foundSong = findSong(song.getTitle());
            if (foundSong != null) {
                return false;
            }
            songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            Song songToAdd = null;

            for (Song song : songs) {
                if (song.getTitle().equals(title)) {
                    songToAdd = song;
                    break;
                }
            }

            return songToAdd;
        }

        private Song findSong(int trackNumber) {
            if (trackNumber > 0 && trackNumber <= songs.size()) {
                return songs.get(trackNumber - 1);
            }

            return null;
        }
    }
}
