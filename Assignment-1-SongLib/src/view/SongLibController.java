package view;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class SongLibController {
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
			if(){
				
			}
			//Check if at least Name and Album were entered
			//Do something to create a new song and populate into the table cell view
		}else {
			
		}
	}
}
