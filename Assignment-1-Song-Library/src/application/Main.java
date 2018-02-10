/*	Created by: Chris Mathew & Kyle Abed
 * 	Title: SongLib
 * 	Class: CS213 Software Methodology
 * 	Purpose: Java GUI for a Song Library using Java FX
 */

package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		FXMLLoader loader = new FXMLLoader();  //Object to load FXML file
		loader.setLocation(getClass().getResource("/view/SongLib-Layout.fxml")); //Sets location for loader to use
		
		
		try {
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
