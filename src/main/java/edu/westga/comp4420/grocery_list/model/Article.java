package edu.westga.comp4420.grocery_list.model;

public class Article {
	private String articleName;
	private String articleContent;
	public Article(String articleName, String articleContent) {
		if (articleName == null) {
			throw new IllegalArgumentException("Must provide a name, but name was null.");
		}
		if (articleName.isEmpty()) {
			throw new IllegalArgumentException("Must provide a name with at least one character.");
		}
		this.articleName = articleName;
		this.articleContent = articleContent;

	}
	
	    // Getter for articleName
    public String getArticleName() {
        return this.articleName;
    }

	    // Getter for articleName
    public String getArticleContent() {
        return this.articleContent;
    }
}