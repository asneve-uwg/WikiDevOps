package edu.westga.comp4420.grocery_list.test.model.article;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import edu.westga.comp4420.grocery_list.model.Article;

class TestConstructor {
	
	@ParameterizedTest
	@CsvSource({"bob, article content"})
	void testValidInput(String name, String content) {
		Article article = new Article(name, content);
		String result = article.getArticleName();

		
		assertEquals(name, result, "checking name of article");
		assertEquals(content, article.getArticleContent(), "retrieving content of article");
	}
	
	@ParameterizedTest
	@CsvSource({", 1", " , 2", "'',content"})
	void testInvalidInput(String name, String content)  {
		assertThrows(IllegalArgumentException.class, ()->{new Article(name, content);});
	}
}
