package com.fizzbuzzcola.vendingmachine.coins;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CoinValueTest {
    @Test
    public void penniesShouldBeOneCent(){
        Coin underTest = new Penny();
        assertThat(underTest.value).isEqualTo(.01);
    }

    @Test
    public void nicklesShouldBeWorthFiveCents(){
        Coin underTest = new Nickle();
        assertThat(underTest.value).isEqualTo(.05);
    }
}
