package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ATMTest {
    private ATM atm;

    @BeforeEach
    void setUp() {
        atm = new ATM();
    }

    @Test
    void insertCardWhenNoCardInserted() {
        atm.insertCard();
        assertTrue(atm.getCurrentState() instanceof CardInsertedState);
    }

    @Test
    void insertCardWhenCardAlreadyInserted() {
        atm.insertCard();
        atm.insertCard();
        assertTrue(atm.getCurrentState() instanceof CardInsertedState);
    }

    @Test
    void ejectCardWhenNoCardInserted() {
        atm.ejectCard();
        assertTrue(atm.getCurrentState() instanceof NoCardState);
    }

    @Test
    void ejectCardWhenCardInserted() {
        atm.insertCard();
        atm.ejectCard();
        assertTrue(atm.getCurrentState() instanceof NoCardState);
    }

    @Test
    void insertPinWhenNoCardInserted() {
        atm.insertPin(1234);
        assertTrue(atm.getCurrentState() instanceof NoCardState);
    }

    @Test
    void insertPinWhenCardInserted() {
        atm.insertCard();
        atm.insertPin(1234);
        assertTrue(atm.getCurrentState() instanceof PinInsertedState);
    }

    @Test
    void requestCashWhenNoCardInserted() {
        atm.requestCash(100);
        assertTrue(atm.getCurrentState() instanceof NoCardState);
    }

    @Test
    void requestCashWhenCardInsertedButNoPin() {
        atm.insertCard();
        atm.requestCash(100);
        assertTrue(atm.getCurrentState() instanceof CardInsertedState);
    }

    @Test
    void requestCashWhenPinInserted() {
        atm.insertCard();
        atm.insertPin(1234);
        atm.requestCash(100);
        assertTrue(atm.getCurrentState() instanceof NoCardState);
    }
}