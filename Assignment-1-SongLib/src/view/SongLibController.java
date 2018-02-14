package view;

import java.util.Optional;

import application.Song;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class SongLibController {
	@FXML AnchorPane Base;
	@FXML TableView<Song> SongTable;
	@FXML TableColumn<Song,String> SongColumn;
	@FXML TableColumn<Song,String> ArtistColumn;
	@FXML TextField SongField;
	@FXML TextField ArtistField;
	@FXML TextField AlbumField;
	@FXML TextField YearField;
	@FXML Text SongDetailsText; 
	@FXML Text SongText;
	@FXML Text ArtistText;
	@FXML Text AlbumText;
	@FXML Text YearText;
	@FXML Button AddButton;
	@FXML Button EditButton;
	@FXML Button DeleteButton;
	
	ObservableList<Song> tableList = FXCollections.observableArrayList();
	
	@FXML
    public void initialize() {
        SongColumn.setCellValueFactory(new PropertyValueFactory<Song, String>("song"));
        ArtistColumn.setCellValueFactory(new PropertyValueFactory<Song, String>("artist"));
        
        // Listen for selection changes and show the song details when changed.
        SongTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showSongDetails(newValue));
    }
	
	public ObservableList<Song> getSongData() {
		return tableList;
	}
	
	private void showSongDetails(Song song) {
    	// If song is null, that means no song is selected.
        if (song != null) {
            // Fill the text fields with info from the selected song object.
            SongField.setText(song.getSong());
            ArtistField.setText(song.getArtist());
            AlbumField.setText(song.getAlbum());
            YearField.setText(song.getYear());
        } else {
            // No song is selected, remove all the text.
            SongField.setText("");
            ArtistField.setText("");
            AlbumField.setText("");
            YearField.setText("");
        }
    }
	@FXML
	private void handleAddButton(ActionEvent event) {
		if (SongField.getText().trim().isEmpty() || ArtistField.getText().trim().isEmpty()) {
			Alert error = new Alert(Alert.AlertType.ERROR, "Please enter a valid Song AND Artist to add to the library", ButtonType.CLOSE);
			error.showAndWait();
			return;	
		} else {
			tableList.add(new Song(SongField.getText().trim(), ArtistField.getText().trim(), AlbumField.getText().trim(), YearField.getText().trim()));
			SongTable.setItems(getSongData());
	
		}  
	 }
	@FXML
	private void handleEditButton(ActionEvent event) {
		
	}
	@FXML
	private void handleDeleteButton(ActionEvent event) {
		int index = SongTable.getSelectionModel().getSelectedIndex();
		if(index < 0 || index > SongTable.getItems().size()) {
			Alert error = new Alert(Alert.AlertType.ERROR, "No song selected.  Please select a valid song.", ButtonType.CLOSE);
			error.showAndWait();
			return;
		}
		//Confirmation Pop-Up
		Alert confirm = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure you want to delete the selected song?", ButtonType.YES, ButtonType.NO);
		Optional<ButtonType> result = confirm.showAndWait();
		if(result.get() == ButtonType.YES) {
			SongTable.getItems().remove(index);
			// If the deleted song isn't the last song in the list, then select the next song.
			if (index < SongTable.getItems().size()) {
        			SongTable.getSelectionModel().select(index);
        			SongTable.getFocusModel().focus(index);
        			showSongDetails(SongTable.getItems().get(index));
            }else {
            		// If the deleted song was the only song in the list, select nothing.
            		if (SongTable.getItems().size() == 0) {
            			showSongDetails(null);
            		}else {
            			// If the deleted song was the last song in the list, select the previous song.
            			SongTable.getSelectionModel().select(index - 1);
                		SongTable.getFocusModel().focus(index - 1);
                		showSongDetails(SongTable.getItems().get(index - 1));
            		}
            }
		}
	
	}
}
