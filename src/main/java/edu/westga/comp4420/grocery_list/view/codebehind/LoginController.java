package edu.westga.comp4420.grocery_list.view.codebehind;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

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

        if (username.equals("user") && password.equals("password")) {
            Main.showMainPage();
        } else {
            System.out.println("Invalid credentials");
        }
    }
}