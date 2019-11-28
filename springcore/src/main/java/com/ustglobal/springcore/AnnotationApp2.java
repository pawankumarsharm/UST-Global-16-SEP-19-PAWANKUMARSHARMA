package com.ustglobal.springcore;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ustglobal.springcore.config.ConfigurationClass;
import com.ustglobal.springcore.di.Animal;
import com.ustglobal.springcore.di.Author;
import com.ustglobal.springcore.di.Book;
import com.ustglobal.springcore.di.Hello;
import com.ustglobal.springcore.di.Pet;

public class AnnotationApp2 {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ConfigurationClass.class);
	Book book=context.getBean(Book.class);
	System.out.println(book.getName());
	System.out.println(book.getAuthor());
	System.out.println(book.getPrice());
	Book book1=context.getBean(Book.class);
	System.out.println(book);
	System.out.println(book1);
	System.out.println("*****************************");
	
//	Animal animal=context.getBean(Animal.class);
//	animal.makeSound();
	
	System.out.println("*****************************");
	Author author=context.getBean(Author.class);
	System.out.println(author.getName());
	System.out.println(author.getPen_name());
	//author.getAuthor().makeSound();
	
	context.close();
}
}
