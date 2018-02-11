package view;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewController {
	@FXML public TableView<String> songTable;
	@FXML public TableColumn<String, String> nameCol;
	@FXML public TableColumn<String,String> artistCol;
	@FXML public TextField name;
	@FXML public TextField artist;
	@FXML public TextField album;
	@FXML public TextField year;
	@FXML public Button editSong;
	@FXML public Button newSong;
	@FXML public Button deleteSong;
	
}
