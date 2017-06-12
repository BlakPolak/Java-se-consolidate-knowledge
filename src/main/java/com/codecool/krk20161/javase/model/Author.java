package com.codecool.krk20161.javase.model;


public class Author extends Person {

    private String biography;

    public Author(String name, String biography) {
        super(name);
        this.biography = biography;
    }

    public Author(String name) {
        super(name);
    }

    public String getBiography() {
        return biography;
    }

    public String getName() {
        return super.getName();
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
