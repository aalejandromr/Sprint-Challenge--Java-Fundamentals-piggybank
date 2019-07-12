package com.lambdaschool;

public class Quarter extends Coin {
    private int value = 25;

    public Quarter() {
        super();
    }

    public Quarter(int quantity) {
        super(quantity);
    }

    @Override
    public int totalValue() {
        return this.value * this.getQuantity();
    }

    @Override
    public String toString() {
        return "Quarter";
    }
}
