package view;

import java.text.NumberFormat;
import java.text.ParsePosition;

import com.sun.xml.internal.ws.util.StringUtils;

import application.Song;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SongLibController {
	@FXML private TableView<Song> tableView;
	@FXML private TableColumn<Song, String> name;
	@FXML private TableColumn<Song, String> artist;
	@FXML Button newSong;
	@FXML Button deleteSong;
	@FXML Button editSong;
	@FXML TextField enterName;
	@FXML TextField enterArtist;
	@FXML TextField enterAlbum;
	@FXML TextField enterYear;
	
	public void addSong(ActionEvent e) {
		Button x = (Button)e.getSource();
		if(x == newSong) {
			//Check if at least Name and Album were entered
			String name = enterName.getText();
			if(name.length() <= 0) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Warning!");
				alert.setHeaderText(null);
				alert.setContentText("Enter the song name with at least 1 character!");
			}
			String artist = enterAlbum.getText();
			if(artist.length() <= 0) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Warning!");
				alert.setHeaderText(null);
				alert.setContentText("Enter artist with at least 1 character!");
			}
			Boolean isAlbum;
			Boolean isYear;
			
			String album = enterAlbum.getText();
			if(album.length() <= 0) {
				isAlbum = false;
			}
			String year = enterAlbum.getText();
			if(album.length() <= 0) {
				isYear = false;
			}else if(isNumeric(year) == true) {
				isYear = true; 
			}else {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Warning!");
				alert.setHeaderText(null);
				alert.setContentText("Enter year using only numeric values!");
			}
			
			//Check for duplicates
			
			
			//Do something to create a new song and populate into the table cell view
		}else {
			
		}
	}
	public static boolean isNumeric(String str){  
		NumberFormat formatter = NumberFormat.getInstance();
		ParsePosition pos = new ParsePosition(0);
		formatter.parse(str, pos);
		return str.length() == pos.getIndex(); 
	}
}
