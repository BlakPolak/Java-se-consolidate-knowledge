package com.codecool.krk20161.javase.model;


import com.codecool.krk20161.javase.exception.AlreadyInCatalogException;

import java.util.ArrayList;
import java.util.List;

public class Catalog implements Search{

    public ArrayList<Book> books;

    public Catalog(){
        this.books = new ArrayList<>();
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void add(Book book) throws AlreadyInCatalogException {
        try{
            for (Book bookInCatalog : books) {
                if ((book.getTitle()).equals(bookInCatalog.getTitle())){
                    throw new Exception();
                }
            }
        }catch (Exception e){
            throw new AlreadyInCatalogException("This book is already in catalog, you can not add it");
        }
        books.add(book);
    }

    public void remove(Book bookToRemove) {
        for (Book bookInCatalog : books) {
            if ((bookToRemove.getTitle()).equals(bookInCatalog.getTitle())){
                if ((bookToRemove.getAuthor().getName()).equals(bookInCatalog.getAuthor().getName()))
                books.remove(bookInCatalog);
            }
        }
    }

    @Override
    public List<Book> searchByTitle(String bookTittle) {
        List<Book> searchedBook = new ArrayList<>();
        for (Book bookInCatalog : books) {
            if ((bookTittle).equals(bookInCatalog.getTitle())){
                searchedBook.add(bookInCatalog);
            }
        }
        return searchedBook;
    }


    @Override
    public List<Book> searchByAuthor(Author author) {
        List<Book> searchedBook = new ArrayList<>();
        for (Book bookInCatalog : books) {
            if ((author.getName()).equals(bookInCatalog.getAuthor().getName())){
                searchedBook.add(bookInCatalog);
            }
        }
        return searchedBook;
    }


}
