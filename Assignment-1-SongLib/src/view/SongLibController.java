package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;



public class SongLibController {
	
	@FXML ListView<String> listViewName;
	@FXML ListView<String> listViewArtist;
	@FXML Button newSong;
	@FXML Button deleteSong;
	@FXML Button editSong;
	@FXML TextField enterName;
	@FXML TextField enterArtist;
	@FXML TextField enterAlbum;
	@FXML TextField enterYear;
	
	private ObservableList<String> obsListName;
	private ObservableList<String> obsListArtist;
	public void start() {
		obsListName = FXCollections.observableArrayList("Chris", "Mathew");
		listViewName.setItems(obsListName);
		obsListArtist = FXCollections.observableArrayList("Mathew", "Chris");
		listViewArtist.setItems(obsListArtist);
	}
	
}
