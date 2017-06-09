package com.codecool.krk20161.javase.model;


import com.codecool.krk20161.javase.exception.AlreadyInCatalogException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalog {

    private ArrayList<Book> books;

    public Catalog(){
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void add(Book book){
        try{
            Iterator catalogIterator = books.iterator();
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

    public List<Book> searchByTitle(String s) {
    }
}
