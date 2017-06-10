package com.codecool.krk20161.javase.model;


import com.codecool.krk20161.javase.exception.AlreadyInCatalogException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Catalog implements Search{

    public ArrayList<Book> books;
    Iterator catalogIterator;

    public Catalog(){
        this.books = new ArrayList<>();
        this.catalogIterator = books.iterator();
    }
    
    public ArrayList<Book> getBooks() {
        return books;
    }

    public void add(Book book) throws AlreadyInCatalogException {
        try{
            while (catalogIterator.hasNext()) {
                Book bookInCatalog = (Book) catalogIterator.next();
                if (book.equals(bookInCatalog)){
                    throw new Exception();
                }
            }
            books.add(book);
        }catch (Exception e){
            throw new AlreadyInCatalogException("This book is already in catalog, you can not add it");
        }
    }

    public void remove(Book bookToRemove) {
    }

    @Override
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


    @Override
    public List<Book> searchByAuthor(Author author) {
        return null;
    }


}
