package com.example.librarymanagement;
import org.springframework.context.ApplicationContext;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.librarymanagement.service.BookService;
public class LibrarymanagementApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LibrarymanagementApplication.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) context.getBean("bookService");
        bookService.addBook();
	}

}
