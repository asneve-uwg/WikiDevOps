package edu.westga.comp4420.grocery_list;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

/**
 * Main class for the JavaFX application.
 *
 * @author Devops 2025 Sneve
 */
public class Main extends Application {
    private static Stage primaryStage;
    public static final String LOGIN_WINDOW_RESOURCE = "view/codebehind/login.fxml";
    public static final String MAIN_WINDOW_RESOURCE = "view/codebehind/main.fxml";
    public static final String WINDOW_TITLE = "JavaFX Sample";

    /**
     * Starts the JavaFX application.
     *
     * @param primaryStage the primary stage for this application
     * @throws IOException if an I/O error occurs
     */
    @Override
    public void start(Stage primaryStage) throws IOException {
        Main.primaryStage = primaryStage;
        showLoginPage();
    }

    /**
     * Shows the login page.
     *
     * @throws IOException if an I/O error occurs
     */
    static void showLoginPage() throws IOException {
        Parent parent = FXMLLoader.load(Main.class.getResource(LOGIN_WINDOW_RESOURCE));
        Scene scene = new Scene(parent);
        primaryStage.setTitle(WINDOW_TITLE);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * The main method to launch the JavaFX application.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);

    }
}