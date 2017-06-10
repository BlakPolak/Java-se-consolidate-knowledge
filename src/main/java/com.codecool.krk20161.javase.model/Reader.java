package com.codecool.krk20161.javase.model;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Reader implements Search {
    String name;
    List<Book> read = new ArrayList<Book>();
    Iterator readerIterator;
    public Reader(String name){
        this.name = name;
        this.readerIterator = read.iterator();
    }
    public Reader(String name, List<Book> read) {
        this.name = name;
        this.read = read;
        this.readerIterator = read.iterator();
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
        while (readerIterator.hasNext()) {
            Book bookInReader = (Book) readerIterator.next();
            if (bookInReader.getTitle().equals(title)) {
                searchedBook.add(bookInReader);
                return searchedBook;
            }
        }
        return searchedBook;
    }

    @Override
    public List<Book> searchByAuthor(Author author) {
        List<Book> searchedBook = new ArrayList<>();
        while (readerIterator.hasNext()) {
            Book bookInCatalog = (Book) readerIterator.next();
            if (bookInCatalog.getAuthor().getName().equals(author.getName())) {
                searchedBook.add(bookInCatalog);
                return searchedBook;
            }
        }
        return searchedBook;


}
