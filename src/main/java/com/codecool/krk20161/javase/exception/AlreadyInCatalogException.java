package com.codecool.krk20161.javase.exception;


public class AlreadyInCatalogException extends Exception {
    public AlreadyInCatalogException(){
    }

    public void getMessage(String message) {
        System.out.println(message);
    }
}
