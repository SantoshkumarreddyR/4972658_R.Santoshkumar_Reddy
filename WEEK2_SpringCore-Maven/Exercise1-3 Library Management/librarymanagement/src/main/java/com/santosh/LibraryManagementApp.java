package com.santosh;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.santosh.service.*;
// Exercise 1
public class LibraryManagementApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        // Exercise 2 starts
        BookService bookService=context.getBean(BookService.class);
        bookService.serviceMethod();
        bookService.printBookRepository();
        // Exercise 2 ends 
        context.close();
    }
}