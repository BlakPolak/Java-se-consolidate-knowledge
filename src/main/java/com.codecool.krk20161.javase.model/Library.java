package com.codecool.krk20161.javase.model;


public class Library {
    Catalog catalog = new Catalog();

    public Library(){
    }
    public Catalog getCatalog() {
        return catalog;
    }

    public void setCatalog(Catalog catalog) {
        this.catalog = catalog;
    }
}
