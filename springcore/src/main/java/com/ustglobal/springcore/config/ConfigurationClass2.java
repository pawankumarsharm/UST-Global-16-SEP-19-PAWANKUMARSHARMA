package com.ustglobal.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Cat;
import com.ustglobal.springcore.di.Dog;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;
@Configuration
public class ConfigurationClass2 {
	
	@Bean(name="book")//for singleton object
	@Scope("prototype")//for prototype object
public Book getBook() {
		Book book=new Book();
		book.setAuthor("jk");
		book.setName("java");
		book.setPrice(67576567);
		return book;
		
	}
	@Bean(name="author")
	public Author getAuthor() {
		Author author=new Author();
		author.setName("pk");
		author.setPen_name("ABC");
		return author;
	}
}
