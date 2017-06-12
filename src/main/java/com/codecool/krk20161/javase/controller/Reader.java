package com.codecool.krk20161.javase.controller;


import com.codecool.krk20161.javase.model.Author;
import com.codecool.krk20161.javase.model.Book;
import com.codecool.krk20161.javase.model.Person;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person implements Search  {


    List<Book> read = new ArrayList<Book>();

    public Reader(String name){
        super(name);
    }

    public Reader(String name, List<Book> read) {
        super(name);
        this.read = read;
    }

    public List<Book> getRead() {
        return read;
    }

    public String getName() {
        return super.getName();
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

