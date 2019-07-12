package com.lambdaschool;

public class Main {
    public static void main(String[] args) {
        piggyBank bank = new piggyBank();
        bank.add(new Quarter());

        bank.add(new Dime());

        bank.add(new Dollar(5));

        bank.add(new Nickel(3));

        bank.add(new Dime(7));

        bank.add(new Dollar());

        bank.add(new Penny(10));
        bank.add(new Penny(1));
        bank.getContents();
        System.out.println();
        bank.getTotalValue();
    }
}
