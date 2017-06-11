package com.codecool.krk20161.javase.model;


import com.codecool.krk20161.javase.controller.Catalog;

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
