package view;




import application.Song;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;



public class SongLibController  {
	
	
	@FXML TableView<Song> tableView;
	@FXML TableColumn<Song, String> nameColumn;
	@FXML Button newSong;
	@FXML Button deleteSong;
	@FXML Button editSong;
	@FXML TextField enterName;
	@FXML TextField enterArtist;
	@FXML TextField enterAlbum;
	@FXML TextField enterYear;
	private ObservableList<Song> tempList;
	private ObservableList<Song> obsListName;
	private ObservableList<Song> obsListArtist;
	public void start() {
		Song first = new Song("Stronger", "KanyeWest");
		obsListName = FXCollections.observableArrayList(first);
		tableView.setItems(obsListName);
		obsListArtist = FXCollections.observableArrayList(first);
		listViewArtist.setItems(obsListArtist);
		newSong.setOnAction(newbuttonHandler);
		deleteSong.setOnAction(deletebuttonHandler);
		editSong.setOnAction(editbuttonHandler);
	}
	
	EventHandler<ActionEvent> newbuttonHandler = new EventHandler<ActionEvent>() {
	    @Override
	    public void handle(ActionEvent event) {
	    		Boolean isName;
	    		Boolean isArtist;
	    		//Boolean isAlbum;
	    		//Boolean isYear;
	    	
	    		String name = enterName.getText();
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
