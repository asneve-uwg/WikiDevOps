package edu.westga.comp4420.grocery_list.model;

/**
 * Represents an article with a name and content.
 * 
 * <p>This class provides methods to get and set the name and content of an article.</p>
 * 
 * @author DevOps 2025 Sneve
 */
public class Article {
    private String articleName;
    private String articleContent;

    /**
     * Constructs an Article with the specified name and content.
     *
     * @param articleName the name of the article
     * @param articleContent the content of the article
     * @throws IllegalArgumentException if the article name is null or empty
     */
    public Article(String articleName, String articleContent) {
        if (articleName == null) {
            throw new IllegalArgumentException(" name was null.");
        }
        if (articleName.isEmpty()) {
            throw new IllegalArgumentException("Enter a name.");
        }
        this.articleName = articleName;
        this.articleContent = articleContent;
    }

    /**
     * Gets the name of the article.
     *
     * @return the name of the article
     */
    public String getArticleName() {
        return this.articleName;
    }

    /**
     * Gets the content of the article.
     *
     * @return the content of the article
     */
    public String getArticleContent() {
        return this.articleContent;
    }

    /**
     * Sets the name of the article.
     *
     * @param articleName the new name of the article
     */
    public void setArticleName(String articleName) {
        if (articleName == null || articleName.isEmpty()) {
            throw new IllegalArgumentException("Must provide a name with at least one character.");
        }
        this.articleName = articleName;
    }

    /**
     * Sets the content of the article.
     *
     * @param articleContent the new content of the article
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}
