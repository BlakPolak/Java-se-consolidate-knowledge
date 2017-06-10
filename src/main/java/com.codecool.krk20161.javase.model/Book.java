package com.codecool.krk20161.javase.model;


public class Book {

    public String title;
    public Author author;
    public String summary;

    public Book(String title, Author author, String summary) {
        this.title = title;
        this.author = author;
        this.summary = summary;
    }

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getSummary() {
        return summary;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }
}
