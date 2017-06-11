package com.codecool.krk20161.javase.model;


public class Author {

    private String name;
    private String biography;

    public Author(String name, String biography) {
        this.name = name;
        this.biography = biography;
    }

    public Author(String name) {
        this.name = name;
    }

    public String getBiography() {
        return biography;
    }

    public String getName() {
        return name;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }
}
