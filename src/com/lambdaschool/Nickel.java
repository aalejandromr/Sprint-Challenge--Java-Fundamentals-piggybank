package com.lambdaschool;

public class Nickel extends Coin {
    private int value = 5;

    public Nickel() {
        super();
    }

    public Nickel(int quantity) {
        super(quantity);
    }

    @Override
    public int totalValue() {
        return this.value * this.getQuantity();
    }

    @Override
    public String toString() {
        return "Nickel";
    }
}
