package edu.westga.comp4420.grocery_list.view.codebehind;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


import edu.westga.comp4420.grocery_list.Main;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Button loginButton;

    @FXML
    private void handleLoginButtonAction() throws IOException {
        String username = this.usernameField.getText();
        String password = this.passwordField.getText();

        if (username.equals("u") && password.equals("p")) {
			try {
				FXMLLoader loader = new FXMLLoader();
				loader.setLocation(Main.class.getResource(Main.MAIN_WINDOW_RESOURCE));
				loader.load();
				Parent parent = loader.getRoot();
				Scene scene = new Scene(parent);
				Stage addItemStage = new Stage();
				addItemStage.setTitle(Main.WINDOW_TITLE);
				addItemStage.setScene(scene);
				MainController controller = (MainController) loader.getController();
				addItemStage.showAndWait();
			} catch (IOException error) {
				System.out.println("Invalid credentials");
			}
		}
	}
}