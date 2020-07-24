package com.fizzbuzzcola.vendingmachine;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VendingMachineTest {
    @Test
    public void vendingMachineShouldExist() {
        VendingMachine underTest = new VendingMachine();
    }

    @Test
    public void noCoinsInMachineShouldReturnInsertCoin() {
        VendingMachine underTest = new VendingMachine();
        String displayText = underTest.displayStatus();
        assertThat(displayText).isEqualTo("Insert Coin");
    }
}
