package com.springer.core.config;

import com.springer.core.domain.Book;
import com.springer.core.domain.Topic;
import org.assertj.core.util.Lists;
import org.springframework.stereotype.Component;

@Component
public class TestDataSetup
{
	public Book createBook(){
		Book book = new Book();
		book.setAuthor("Test Author");
		book.setTitle("Test Title");
		book.setTopics(Lists.newArrayList(Topic.BUSINESS));
		return book;
	}
}
