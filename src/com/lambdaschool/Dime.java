package com.lambdaschool;

public class Dime extends Coin {
    private int value = 10;

    public Dime() {
        super();
    }

    public Dime(int quantity) {
        super(quantity);
    }

    @Override
    public int totalValue() {
        return this.value * this.getQuantity();
    }

    @Override
    public String toString() {
        return "Dime";
    }
}
