package com.fizzbuzzcola.vendingmachine;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private BigDecimal coinSlotBalance = BigDecimal.ZERO;
    private List<String> coinReturn = new ArrayList<>();

    public String displayStatus() {
        if (coinSlotBalance.doubleValue() == 0) {
            return "Insert Coin";
    } return coinSlotBalance.setScale(2).toString();
    }

    public void insertCoin(String coin) {
        if(coin.equalsIgnoreCase("Nickel")) {
            coinSlotBalance = coinSlotBalance.add(BigDecimal.valueOf(0.05));
        }
        if(coin.equalsIgnoreCase("Dime")) {
            coinSlotBalance = coinSlotBalance.add(BigDecimal.valueOf(0.10));
        }
        if(coin.equalsIgnoreCase("Quarter")) {
            coinSlotBalance = coinSlotBalance.add(BigDecimal.valueOf(0.25));
        } else {
            coinReturn.add(coin);
        }
    }

    public List<String> emptyCoinReturn() {
        List<String> coinReturnContents = List.copyOf(coinReturn);
        coinReturn.clear();
        return coinReturnContents;
    }
}
