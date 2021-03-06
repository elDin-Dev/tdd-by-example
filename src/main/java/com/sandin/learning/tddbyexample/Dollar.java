package com.sandin.learning.tddbyexample;

public class Dollar {

    private int amount ;

    public Dollar(int amount) {
        this.amount=amount;
    }

    public Dollar times(int multiplier) {

        return new Dollar(amount * multiplier);
    }

    public boolean equals(Object obj) {

        Dollar dollar = (Dollar) obj;

        return amount==dollar.amount;
    }
}
