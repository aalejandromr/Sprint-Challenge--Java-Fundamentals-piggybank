package com.lambdaschool;

public class Penny extends Coin {
    private int value = 1;

    public Penny() {
        super();
    }

    public Penny(int quantity) {
        super(quantity);
    }

    @Override
    public int totalValue() {
        return this.value * this.getQuantity();
    }

    @Override
    public String toString() {
        return "Penny";
    }
}
