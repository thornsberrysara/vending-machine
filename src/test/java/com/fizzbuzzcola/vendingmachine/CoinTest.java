package com.fizzbuzzcola.vendingmachine;

import org.junit.jupiter.api.Test;

public class CoinTest {
    @Test
    public void coinsShouldExist(){
        Coin underTest;
    }

    @Test
    public void penniesShouldBeACoin(){
        Coin underTest = new Penny();
    }

    @Test
    public void dimesShouldBeACoin(){
        Coin underTest = new Dime();
    }

    @Test
    public void nicklesShouldBeACoin(){
        Coin underTest = new Nickle();
    }

    @Test
    public void quartersShouldBeACoin(){
        Coin underTest = new Quarter();
    }
}
