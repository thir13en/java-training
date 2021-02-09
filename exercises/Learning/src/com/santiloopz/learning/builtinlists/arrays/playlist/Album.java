package com.santiloopz.learning.builtinlists.arrays.playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        Song foundSong = findSong(title);
        if (foundSong != null) {
            return false;
        }
        songs.add(new Song(title, duration));
        return true;
    }

    public Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playlist) {
        Song songToAdd = songs.get(trackNumber);

        if (songToAdd == null) {
            return false;
        }

        return true;
    }

    public boolean addToPlaylist() {
        return false;
    }
}
