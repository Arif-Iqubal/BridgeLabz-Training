package com.music;

//Stores song details
class Song {
	int trackId; // Unique track ID
	String title; // Song title
	String artist;

	Song(int trackId, String title, String artist) {
		this.trackId = trackId;
		this.title = title;
		this.artist = artist;
	}
}
