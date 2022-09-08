package net.bsocquet.java17.java17Exemple.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public final class NewBook extends Book {

    private double price;

    public NewBook(String title, double price) {
        super(title);
        this.price = price;
    }
}
