package com.springer.rest.config;

import com.springer.core.domain.Book;
import com.springer.core.domain.Topic;
import org.assertj.core.util.Lists;

public class TestDataSetup
{
	public Book createBook(){
		Book book = new Book();
		book.setAuthor("Test Author");
		book.setTitle("Test Title");
		book.setTopics(Lists.newArrayList(Topic.BUSINESS));
		return book;
	}
	
	public Book createBook(String author, String title){
		Book book = new Book();
		book.setAuthor(author);
		book.setTitle(title);
		book.setTopics(Lists.newArrayList(Topic.BUSINESS));
		return book;
	}
}