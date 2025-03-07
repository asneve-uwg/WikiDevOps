package edu.westga.comp4420.grocery_list;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 * Entry point for the program
 *
 * @author	Comp 4420
 * @version Spring 2025
 */
public class Main extends Application {
	public static final String WINDOW_TITLE = "JavaFX Sample";
	public static final String MAIN_WINDOW_RESOURCE = "view/codebehind/MainWindow.fxml";
	public static final String ADD_ITEM_WINDOW_RESOURCE = "view/codebehind/AddItemWindow.fxml";
	public static final String UPDATE_ITEM_WINDOW_RESOURCE = "view/codebehind/UpdateItemWindow.fxml";

	/**
	 * JavaFX entry point.
	 *
	 * @precondition none
	 * @postcondition none
	 *
	 * @throws IOException
	 */
	@Override
	public void start(Stage primaryStage) throws IOException {
		Parent parent = FXMLLoader.load(getClass().getResource(Main.MAIN_WINDOW_RESOURCE));
		Scene scene = new Scene(parent);
		primaryStage.setTitle(WINDOW_TITLE);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	/**
	 * Primary Java entry point.
	 *
	 * @precondition none
	 * @postcondition none
	 *
	 * @param args
	 *            command line arguments
	 */
	public static void main(String[] args) {
		Main.launch(args);
	}
}
