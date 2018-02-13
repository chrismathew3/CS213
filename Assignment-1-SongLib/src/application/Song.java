package application;

import javafx.beans.property.SimpleStringProperty;

public class Song {

	public SimpleStringProperty name;
	public String Name;
	public SimpleStringProperty artist;
	public String Artist;
	public SimpleStringProperty album;
	public String Album;
	public SimpleStringProperty year;
	public String Year;
	
	public Song(String name, String artist) {
		this.name = new SimpleStringProperty(name);
		this.Name = name;
		this.artist = new SimpleStringProperty(artist);
		this.Artist = artist;
	}
	
	public Song(String name, String artist, String album) {
		this.name = new SimpleStringProperty(name);
		this.Name = name;
		this.artist = new SimpleStringProperty(artist);
		this.Artist = artist;
		this.album = new SimpleStringProperty(album);
		this.Album = album;
	}
	
	public Song(String name, String artist, String album, String year) {
		this.name = new SimpleStringProperty(name);
		this.Name = name;
		this.artist = new SimpleStringProperty(artist);
		this.Artist = artist;
		this.album = new SimpleStringProperty(album);
		this.Album = album;
		this.year = new SimpleStringProperty(year);
		this.Year = year;
	}
	
	public void editName(String name) {
			this.album = new SimpleStringProperty(name);
			this.Name = name;
	}
	public void editAlbum(String album) {
			this.album = new SimpleStringProperty(album);
			this.Album = album;
	}
	public void editArtist(String artist) {
			this.artist = new SimpleStringProperty(artist);
			this.Artist = artist;
	}
	
	public void editYear(String year) {
			this.year = new SimpleStringProperty(year);
			this.Year = year;
	}
	public String getName(Song s) {
		return s.Name;
	}
	public SimpleStringProperty getNameProperty() {
		return this.name;
	}
	public String getArtist(Song s) {
		return s.Artist;
	}
	public SimpleStringProperty getArtistProperty() {
		return this.artist;
	}
	public String getAlbum(Song s) {
		return s.Album;
	}
	public String getYear(Song s) {
		return s.Year;
	}
}
