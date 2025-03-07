package edu.westga.comp4420.grocery_list;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;



public class Main extends Application {
    private static Stage primaryStage;
	public static final String LOGIN_WINDOW_RESOURCE = "view/codebehind/login.fxml";
	public static final String MAIN_WINDOW_RESOURCE = "view/codebehind/main.fxml";
	public static final String WINDOW_TITLE = "JavaFX Sample";



    @Override
    public void start(Stage primaryStage) throws IOException {
        Main.primaryStage = primaryStage;
        showLoginPage();
    }

    static void showLoginPage() throws IOException {
		Parent parent = FXMLLoader.load(Main.class.getResource("view/codebehind/login.fxml"));
		Scene scene = new Scene(parent);
		primaryStage.setTitle("JavaFX Sample");
		primaryStage.setScene(scene);
		primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}