package net.bsocquet.java17.java17Exemple.model;


import lombok.Data;

@Data
public abstract class Book {

    private String title;

    Book(String title ) {
        this.title = title;
    }
}
