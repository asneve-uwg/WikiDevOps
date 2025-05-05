package edu.westga.comp4420.grocery_list.view.codebehind;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import edu.westga.comp4420.grocery_list.Main;

/**
 * Controller class for handling login actions.
 *
 * @author Devops 2025 Sneve
 */
public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;

    /**
     * Handles the login button action.
     * 
     * @throws IOException if an I/O error occurs
     */
	@FXML
	private void handleLoginButtonAction(ActionEvent event) {
		String username = this.usernameField.getText();
		String password = this.passwordField.getText();

		try {
			if (this.isValidUser(username, password)) {
				this.loadFXML(Main.MAIN_WINDOW_RESOURCE, MainController.class);
			} else {
				System.out.println("Invalid username or password.");
			}
		} catch (IOException e) {
			System.out.println("An error occurred while checking the user credentials: " + e.getMessage());
		}
	}


    @FXML
    private void handleCreateUserButtonAction(ActionEvent event) {
        this.loadFXML(Main.CREATE_ACCOUNT_WINDOW_RESOURCE, CreateUserController.class);
    }

    private boolean isValidUser(String username, String password) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line; 
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2 && parts[0].equals(username) && parts[1].equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }

    private void loadFXML(String resource, Class<?> controllerClass) { 
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(Main.class.getResource(resource));
            loader.load();
            Parent parent = loader.getRoot();
            Scene scene = new Scene(parent);
            Stage mainStage = new Stage();
            mainStage.setTitle(Main.WINDOW_TITLE);
            mainStage.setScene(scene);
            Object controller = loader.getController(); 
            mainStage.showAndWait();
        } catch (IOException error) {
            System.out.println("An error occurred: " + error.getMessage()); 
        }
    }
}
