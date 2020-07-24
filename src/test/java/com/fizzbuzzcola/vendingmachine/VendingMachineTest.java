package com.fizzbuzzcola.vendingmachine;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VendingMachineTest {

    private VendingMachine underTest;

    @BeforeEach
    void setup() {
         underTest = new VendingMachine();
    }

    @Test
    public void noCoinsInMachineShouldReturnInsertCoin() {
        String displayText = underTest.displayStatus();
        assertThat(displayText).isEqualTo("Insert Coin");
    }

    @Test
    public void whenNickelInsertedDisplayUpdate() {
        underTest.insertCoin("Nickel");
        assertThat(underTest.displayStatus()).isEqualTo("0.05");
    }

    @Test
    public void whenDimeInsertedDisplayUpdate() {
        underTest.insertCoin("Dime");
        assertThat(underTest.displayStatus()).isEqualTo("0.10");
    }

    @Test
    public void whenQuarterInsertedDisplayUpdate() {
        underTest.insertCoin("Quarter");
        assertThat(underTest.displayStatus()).isEqualTo("0.25");
    }
}
