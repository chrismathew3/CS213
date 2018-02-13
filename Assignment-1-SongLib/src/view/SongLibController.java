package view;




import java.util.ArrayList;
import java.util.List;

import application.Main;
import application.Song;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.geometry.Insets;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;



public class SongLibController  {
	
	
	@FXML TableView<Song> songTable;
	@FXML TableColumn<Song, String> nameColumn;
	//@FXML TableColumn<Song, String> tableColArtist;
	@FXML Button newSong;
	@FXML Button deleteSong;
	@FXML Button editSong;
	@FXML TextField enterSong;
	@FXML TextField enterArtist;
	@FXML TextField enterAlbum;
	@FXML TextField enterYear;
	public ObservableList<Song> data;
	//private ObservableList<Song> obsListArtist;
	public void start() {
		songTable = new TableView<Song>();
		nameColumn = new TableColumn<Song,String>("Name");
		nameColumn.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());
		data = getSongList();
		songTable.setItems(data);
		
		// Select the first row
		songTable.getSelectionModel().select(0);
		songTable.getSelectionModel().getSelectedItem();
		songTable.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showSongDetails(newValue));
		

		//tableColArtist = new TableColumn<Song, String>("Artist");
		//List<Song> list = new ArrayList<Song>();
		//list.add(new Song("Stronger", "Kanye West"));
		//list.add(new Song("Real Friends", "Camilia Cabello"));
		//data.add(list);
		//tableColSong.setCellValueFactory(cellData -> cellData.getValue().getNameProperty());
		//tableColArtist.setCellValueFactory(cellData -> cellData.getValue().getArtistProperty());
		//tableView.setItems(data);
		//tableColSong = new TableColumn<List<Song>, String>("Name");
		//tableColSong.setCellValueFactory(new PropertyValueFactory("name"));
		//tableColArtist.setCellValueFactory
		//tableView.getColumns().setAll(tableColSong);
		//tableView.setItems(obsListName);
		//obsListArtist = FXCollections.observableArrayList(first);
		//tableView.setItems();
		//tableView.getSelectionModel().selectedItemProperty().addListener((observable, oldValue, newValue) -> showSongDetails(newValue));
		newSong.setOnAction(newbuttonHandler);
		deleteSong.setOnAction(deletebuttonHandler);
		editSong.setOnAction(editbuttonHandler);
	}
	
	 private void showSongDetails(Song song) {
		 // If song is null, that means no song is selected.
		 if (song != null) {
			 // Fill the text fields with info from the selected song object.
			 enterSong.setText(song.getName(song));
	         enterArtist.setText(song.getArtist(song));
	         enterAlbum.setText(song.getAlbum(song));
	         enterYear.setText(song.getYear(song));
	     } else {
	         // No song is selected, remove all the text.
	         enterSong.setText("");
	         enterArtist.setText("");
	         enterAlbum.setText("");
	         enterYear.setText("");
	     }
	 }
	 private ObservableList<Song> getSongList() {
		 
		 Song one = new Song("Pray for me", "The Weekend", "Pray for Me","2018");
		 Song two = new Song("Stronger", "Kanye West", "Graduation","2007");
		 Song three = new Song("All the stars", "Kendrick Lamar", "All the Stars","2018");
	 
	     ObservableList<Song> list = FXCollections.observableArrayList(one, two, three);
	     return list;
	 }
	
	EventHandler<ActionEvent> newbuttonHandler = new EventHandler<ActionEvent>() {
	    @Override
	    public void handle(ActionEvent event) {
	    		@SuppressWarnings("unused")
				Boolean isName;
	    		@SuppressWarnings("unused")
				Boolean isArtist;
	    		//Boolean isAlbum;
	    		//Boolean isYear;
	    	
	    		String name = enterSong.getText();
			if(name.length() <= 1) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Warning!");
				alert.setHeaderText(null);
				alert.setContentText("Enter the song name with at least 1 character!");
				alert.showAndWait();
				isName = false;
			}else {
				isName = true;
			}
			
			String artist = enterArtist.getText();
			if(artist.length() <= 1) {
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("Warning!");
				alert.setHeaderText(null);
				alert.setContentText("Enter artist with at least 1 character!");
				alert.showAndWait();
				isArtist = false;
			}else {
				isArtist = true;
			}
		/*
			if((isName && isArtist) == true) {
				Song temp = new Song(name, artist);
				
			
				tempList = FXCollections.observableArrayList(temp);
				ObservableList<Song> concatName = FXCollections.concat(tempList, obsListName);
				obsListName = concatName;
				listViewName.setItems(concatName);
	    			System.out.println("NAME IS: " + temp.name + " Artist is: " + temp.artist + " ");
			}else {
				System.out.println("Alert Should of popped up!");
			}
		*/
	    		event.consume();
	    }
	};
	EventHandler<ActionEvent> editbuttonHandler = new EventHandler<ActionEvent>() {
	    @Override
	    public void handle(ActionEvent event) {
	        //label.setText("Accepted");
	    		System.out.println("HERE");
	        event.consume();
	    }
	};
	EventHandler<ActionEvent> deletebuttonHandler = new EventHandler<ActionEvent>() {
	    @Override
	    public void handle(ActionEvent event) {
	        //label.setText("Accepted");
	    		System.out.println("HERE");
	        event.consume();
	    }
	};
	
}
