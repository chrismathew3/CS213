package view;

import application.Song;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;
import javafx.scene.layout.AnchorPane;
import javafx.scene.control.Label;
import javafx.event.EventHandler;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.cell.PropertyValueFactory;

public class SongLibController {
	
	ObservableList<Song> tableList = FXCollections.observableArrayList();
	
	@FXML AnchorPane anchorPane;
	@FXML Label songLabel;
	@FXML Label artistLabel;
	@FXML Label albumLabel;
	@FXML Label yearLabel;
	@FXML TextField enterSong;
	@FXML TextField enterArtist;
	@FXML TextField enterAlbum;
	@FXML TextField enterYear;	
	@FXML Button addSong;
	@FXML Button deleteSong;
	@FXML Button editSong;
	@FXML TableView<Song> songLib;
	@FXML TableColumn<Song, String>songColumn;
	@FXML TableColumn<Song, String>artistColumn;
	
	@FXML
    public void initialize() {
        songColumn.setCellValueFactory(new PropertyValueFactory<Song, String>("song"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<Song, String>("artist"));
    }
	
	@FXML
	 private void handleAddButton(ActionEvent event) {
		if (enterSong.getText().trim().isEmpty() || enterArtist.getText().trim().isEmpty()) {
			Alert error = new Alert(Alert.AlertType.ERROR, "Please enter a valid Song AND Artist to add to the library", ButtonType.CLOSE);
			error.showAndWait();
			return;	
		} else {
			tableList.add(new Song(enterSong.getText().trim(), enterArtist.getText().trim()));
			songLib.setItems(getSongData());
			
			
			
			
			
			
			
		
			
			
			
			
			
			
			
			
			
			
		}  
	 }
	
	

    
	
	
	
	public ObservableList<Song> getSongData() {
		return tableList;
	}
	
	
	
	
	
	
	
	
}
	
	
	
	
	
