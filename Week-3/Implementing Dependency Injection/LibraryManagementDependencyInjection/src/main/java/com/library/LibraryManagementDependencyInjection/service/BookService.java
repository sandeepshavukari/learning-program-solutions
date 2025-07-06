package com.library.LibraryManagementDependencyInjection.service;

import com.library.LibraryManagementDependencyInjection.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook() {
        System.out.println("BookService: Adding a book...");
        bookRepository.save();
    }
}