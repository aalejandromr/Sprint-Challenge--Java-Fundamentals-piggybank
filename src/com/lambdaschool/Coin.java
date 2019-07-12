package com.lambdaschool;

public abstract class Coin {
    private int quantity;

    public Coin() {
        this.quantity = 1;
    }

    public Coin(int quantity) {
        this.quantity = quantity;
    }

    public abstract int totalValue();

    public int getQuantity() {
        return this.quantity;
    }

}
