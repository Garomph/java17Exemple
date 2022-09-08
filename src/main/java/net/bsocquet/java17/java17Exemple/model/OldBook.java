package net.bsocquet.java17.java17Exemple.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public final class OldBook extends Book {

    private BigDecimal value;

    public OldBook(String title, BigDecimal value) {
        super(title);
        this.value = value;
    }
}
