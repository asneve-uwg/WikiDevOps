package edu.westga.comp4420.grocery_list.view.codebehind;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class CreateUserController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private PasswordField passwordField;

    @FXML
    private TextField usernameField;

    @FXML
    private Label wrongLogin;

    @FXML
    private Button loginButton;
    
    @FXML
    private Label messageLabel;

    private HashMap<String, String> userDatabase = new HashMap<>();

    @FXML
    private void handleCreateUserButtonAction(ActionEvent event) {
        String username = this.usernameField.getText();
        String password = this.passwordField.getText();
        if (!username.isEmpty() && !password.isEmpty()) {
            try {
                this.saveUserToFile(username, password);
                this.messageLabel.setText("Account created successfully!");
            } catch (IOException e) {
                this.messageLabel.setText("Error creating user");
                e.printStackTrace();
            }
        } else {
            this.messageLabel.setText("Please enter a username and password.");
        }
    }

    private void saveUserToFile(String username, String password) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
            writer.write(username + ":" + password);
            writer.newLine();
        }
    }
}
