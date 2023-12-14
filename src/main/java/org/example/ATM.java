package org.example;

/**
 * The ATM class represents an Automated Teller Machine (ATM).
 * It uses the state pattern to manage its states and behaviors.
 */
public class ATM {
    // The current state of the ATM
    ATMState state;

    /**
     * Constructs a new ATM with the initial state set to NoCardState.
     */
    public ATM() {
        state = new NoCardState(this);
    }

    /**
     * Invokes the insertCard method of the current state.
     */
    public void insertCard() {
        state.insertCard();
    }

    /**
     * Invokes the ejectCard method of the current state.
     */
    public void ejectCard() {
        state.ejectCard();
    }

    /**
     * Invokes the insertPin method of the current state.
     * @param pin The pin to be inserted.
     */
    public void insertPin(int pin) {
        state.insertPin(pin);
    }

    /**
     * Invokes the requestCash method of the current state.
     * @param amount The amount of cash to be requested.
     */
    public void requestCash(int amount) {
        state.requestCash(amount);
    }

    /**
     * Sets the current state of the ATM.
     * @param state The new state to be set.
     */
    public void setState(ATMState state) {
        this.state = state;
    }

    /**
     * Returns the current state of the ATM.
     * @return The current state of the ATM.
     */
    ATMState getCurrentState() {
        return state;
    }
}