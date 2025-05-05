package edu.westga.comp4420.grocery_list.view.codebehind;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import edu.westga.comp4420.grocery_list.model.Article;

/**
 * Controller class for handling main window actions.
 * 
 * <p>This class handles the actions related to the main window, such as searching for articles and displaying them.</p>
 * 
 * @author Devops 2025 Sneve
 */
public class MainController {
    @FXML
    private TextField searchField;
    @FXML
    private TextArea articleArea;

    private Article article;

    /**
     * Handles the search button action.
     * Fetches the Wikipedia article based on the search query and displays it in the article area.
     */
    @FXML
    private void handleSearchButtonAction() {
        String searchQuery = this.searchField.getText();
        String articleContent = this.fetchWikipediaArticle(searchQuery);
        this.articleArea.setText(articleContent);
    }

    /**
     * Fetches the Wikipedia article content for the given query.
     * 
     * @param query the search query
     * @return the content of the Wikipedia article
     */
    private String fetchWikipediaArticle(String query) {
        // Create a new Article object if it doesn't exist
        if (this.article == null) {
            this.article = new Article(query, "article");
        } else {
            // Set the article name and content
            this.article.setArticleName(query);
            this.article.setArticleContent("article");
        }
        
        // Return the article content with additional information
        return this.article.getArticleContent() + " content for: " + this.article.getArticleName();
    }

    /**
     * Gets the current article.
     * 
     * @return the current article
     */
    public Article getArticle() {
        return this.article;
    }

    /**
     * Sets the current article.
     * 
     * @param article the article to set
     */
    public void setArticle(Article article) {
        this.article = article;
        this.articleArea.setText(article.getArticleContent());
    }
}