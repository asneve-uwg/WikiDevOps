package edu.westga.comp4420.grocery_list.view.codebehind;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class MainController {
    @FXML
    private TextField searchField;
    @FXML
    private TextArea articleArea;

    @FXML
    private void handleSearchButtonAction() {
        String searchQuery = this.searchField.getText();
        String article = this.fetchWikipediaArticle(searchQuery);
        this.articleArea.setText(article);
    }

    private String fetchWikipediaArticle(String query) {
        // Implement the logic to fetch Wikipedia article using Wikipedia API
        return "Sample Wikipedia article content for: " + query;
    }
}