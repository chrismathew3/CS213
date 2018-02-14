package application;

public class Song {

	public String song;
	public String artist;
	public String album;
	public String year;
	
	public Song(String song, String artist) {
		this.song = song;
		this.artist = artist;
	}
	
	public Song(String song, String artist, String album, String year) {
		this.song = song;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}	
	
	public String getSong() {
		return this.song;
	}
	
	public String getArtist() {
		return this.artist;
	}
	
	public String getAlbum() {
		return this.album;
	}
	
	public String getYear() {
		return this.year;
	}
	
	public void setSong(String song) {
		this.song = song;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public void setAlbum(String album) {
		this.album = album;
	}
	
	public void setYear(String year) {
		this.year = year;
	}
}


	
	
