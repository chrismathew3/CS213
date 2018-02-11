/*	Created by: Chris Mathew & Kyle Abed
 * 	Title: SongLib
 * 	Class: CS213 Software Methodology
 * 	Purpose: Java GUI for a Song Library using Java FX
 */

package application;
	
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) throws IOException  {
		try {
			// Load Song Overview
			FXMLLoader loader = new FXMLLoader();  //Object to load FXML file
			loader.setLocation(getClass().getResource("/view/SongLib-Layout.fxml")); //Sets location for loader to use
			AnchorPane root = (AnchorPane)loader.load();
			
			// Set Song Overview as Root
			Scene scene = new Scene(root,400,600);
			primaryStage.setTitle("SongLib");
			primaryStage.setScene(scene);
			primaryStage.show(); 
			
			// Get the controller and pass off control
			ViewController vc = loader.getController();
			
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
