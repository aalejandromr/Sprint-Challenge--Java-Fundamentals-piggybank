package com.lambdaschool;

public class Dollar extends Coin {

    private int value = 100;

    public Dollar() {
        super();
    }

    public Dollar(int quantity) {
        super(quantity);
    }

    @Override
    public int totalValue() {
        return this.value * this.getQuantity();
    }

    @Override
    public String toString() {
        return "Dollar";
    }
}
