package com.fizzbuzzcola.vendingmachine;

import java.math.BigDecimal;

public class VendingMachine {
    private BigDecimal coinSlotBalance = BigDecimal.ZERO;

    public String displayStatus() {
        if (coinSlotBalance.doubleValue() == 0) {
            return "Insert Coin";
    } return coinSlotBalance.setScale(2).toString();
    }

    public void insertCoin(String coin) {
        if(coin.equalsIgnoreCase("Nickel")) {
            coinSlotBalance = coinSlotBalance.add(BigDecimal.valueOf(0.05));
        }
    }
}
