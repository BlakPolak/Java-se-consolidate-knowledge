package com.codecool.krk20161.javase.model;


import com.codecool.krk20161.javase.exception.AlreadyInCatalogException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalog {

    public ArrayList<Book> books;
    Iterator catalogIterator;

    public Catalog(){
        this.catalogIterator = books.iterator();
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void add(Book book){
        try{
            while (catalogIterator.hasNext()) {
                Book bookInCatalog = (Book) catalogIterator.next();
                if (book.equals(bookInCatalog)){
                    throw new AlreadyInCatalogException();
                }
            }
            books.add(book);
        }catch (AlreadyInCatalogException e){
            e.getMessage("This book is already in catalog, you can not add it");
        }
    }

    public List<Book> searchByTitle(String bookTittle) {
        List<Book> searchedBook = new ArrayList<>();
        while (catalogIterator.hasNext()) {
            Book bookInCatalog = (Book) catalogIterator.next();
            if (bookInCatalog.getTitle().equals(bookTittle)) {
                searchedBook.add(bookInCatalog);
                return searchedBook;
            }
        }
        return searchedBook;
    }

    public List<Book> searchByAuthor(Author author) {
        return null;
    }


    public void remove(Book bookToRemove) {
    }


}
