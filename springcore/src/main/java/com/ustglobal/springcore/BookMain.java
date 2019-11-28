package com.ustglobal.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class BookMain {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("books.xml");
		 Book book=context.getBean(Book.class);
	       System.out.println(book.getName());
	       System.out.println(book.getPrice());
	       System.out.println(book.getAuthor());
	       
	       Book book2=context.getBean(Book.class);
	       System.out.println(book);
	       System.out.println(book2);
	       
	       Author author=context.getBean(Author.class);
	       System.out.println(author.getName());
	       System.out.println(author.getPen_name());
	}

}
