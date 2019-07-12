package com.lambdaschool;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class piggyBank {
    private ArrayList<Coin> money = new ArrayList<>();

    public void add(Coin money) {
        this.money.add(money);
    }

    public void getContents() {
        for (Coin money : money) {
            int q = money.getQuantity();
            if (q > 1) {
                System.out.println(money.getQuantity() + " " + money.toString() + "s");
            } else {
                System.out.println(money.getQuantity() + " " + money.toString());
            }
        }
    }

    public void getTotalValue() {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        int total = 0;
        for (Coin money : money) {
            total += money.totalValue();
        }
        System.out.println("Bank Holds: " + fp.format(total / 100.00));
        //        100.00 because we need to force Java to divide by a double, if not
        //        we receive a int down rounded
    }
}
