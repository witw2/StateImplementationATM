package org.example;

/**
 * The ATMState class is an abstract class that represents the state of an ATM.
 * It provides a common interface for all concrete state classes.
 */
abstract class ATMState {
    // The ATM that this state belongs to
    protected ATM atm;

    /**
     * Constructs a new ATMState for the given ATM.
     * @param atm The ATM this state belongs to.
     */
    public ATMState(ATM atm) {
        this.atm = atm;
    }

    /**
     * Handles the event of a card insertion.
     * This method is abstract and should be implemented by all concrete state classes.
     */
    abstract void insertCard();

    /**
     * Handles the event of a card ejection.
     * This method is abstract and should be implemented by all concrete state classes.
     */
    abstract void ejectCard();

    /**
     * Handles the event of a pin insertion.
     * This method is abstract and should be implemented by all concrete state classes.
     * @param pin The pin to be inserted.
     */
    abstract void insertPin(int pin);

    /**
     * Handles the event of a cash request.
     * This method is abstract and should be implemented by all concrete state classes.
     * @param amount The amount of cash to be requested.
     */
    abstract void requestCash(int amount);
}