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

    private Song findSong(String title) {
        for (Song song : songs) {
            if (song.getTitle().equals(title)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        if (trackNumber < 1 || songs.size() > trackNumber) {
            return false;
        }

        playlist.add(songs.get(trackNumber - 1));
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song songToAdd = null;

        for (Song song : songs) {
            if (song.getTitle().equals(songTitle)) {
                songToAdd = song;
                break;
            }
        }

        if (songToAdd == null) {
            return false;
        }

        playlist.add(songToAdd);
        return true;
    }
}
