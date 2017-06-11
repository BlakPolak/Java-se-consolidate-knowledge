package com.codecool.krk20161.javase.controller;


import com.codecool.krk20161.javase.model.Author;
import com.codecool.krk20161.javase.model.Book;

import java.util.ArrayList;
import java.util.List;

public class Reader implements Search {

    String name;
    List<Book> read = new ArrayList<Book>();

    public Reader(String name){
        this.name = name;
    }
    public Reader(String name, List<Book> read) {
        this.name = name;
        this.read = read;
    }

    public List<Book> getRead() {
        return read;
    }

    public String getName() {
        return name;
    }

    @Override
    public List<Book> searchByTitle(String title) {
        List<Book> searchedBook = new ArrayList<>();
        for (Book bookInCatalog : read) {
            if ((title).equals(bookInCatalog.getTitle())){
                searchedBook.add(bookInCatalog);
            }
        }
        return searchedBook;
    }

    @Override
    public List<Book> searchByAuthor(Author author) {
        List<Book> searchedBook = new ArrayList<>();
        for (Book bookInCatalog : read) {
            if ((author.getName()).equals(bookInCatalog.getAuthor().getName())){
                searchedBook.add(bookInCatalog);
            }
        }
        return searchedBook;
    }
}

