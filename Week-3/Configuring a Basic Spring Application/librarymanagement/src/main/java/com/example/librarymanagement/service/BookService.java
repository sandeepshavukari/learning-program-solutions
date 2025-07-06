package com.example.librarymanagement.service;

import com.example.librarymanagement.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    public void addBook() {
        System.out.println("Adding a book...");
        bookRepository.save();
    }
}