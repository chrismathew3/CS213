package application;

public class Song {

	public String name;
	public String artist;
	public String album;
	public String year;
	
	public Song(String name, String artist) {
		this.name = name;
		this.artist = artist;
	}
	
	public Song(String name, String artist, String album, String year) {
		this.name = name;
		this.artist = artist;
		this.album = album;
		this.year = year;
	}
	
	public boolean editName(String name) {
		if(name != null) {
			this.name = name;
			return true;
		}else {
			return false;
		}
	}
	public boolean editAlbum(String album) {
		if(album != null) {
			this.album = album;
			return true;
		}else {
			return false;
		}
	}
	public boolean editArtist(String artist) {
		if(artist != null) {
			this.artist = artist;
			return true;
		}else {
			return false;
		}
	}
	public boolean editYear(String year) {
		if(year != null) {
			this.year = year;
			return true;
		}else {
			return false;
		}
	}


	
	
}
