package view;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;



public class SongLibController  {
	
	
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
		obsListName = FXCollections.observableArrayList("Stronger");
		listViewName.setItems(obsListName);
		obsListArtist = FXCollections.observableArrayList("Kanye West");
		listViewArtist.setItems(obsListArtist);
		newSong.setOnAction(newbuttonHandler);
		deleteSong.setOnAction(deletebuttonHandler);
		editSong.setOnAction(editbuttonHandler);
	}
	
	EventHandler<ActionEvent> newbuttonHandler = new EventHandler<ActionEvent>() {
	    @Override
	    public void handle(ActionEvent event) {
	    		System.out.println("HERE");
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
