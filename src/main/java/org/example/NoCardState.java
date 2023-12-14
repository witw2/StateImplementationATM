package org.example;

/**
 * The NoCardState class represents the state of the ATM when no card is inserted.
 * It extends the ATMState class and overrides its methods to provide the specific behavior for this state.
 */
public class NoCardState extends ATMState {
    /**
     * Constructs a new NoCardState for the given ATM.
     * @param atm The ATM this state belongs to.
     */
    public NoCardState(ATM atm) {
        super(atm);
    }

    /**
     * Handles the event of a card insertion.
     * In this state, it changes the state of the ATM to CardInsertedState.
     */
    @Override
    public void insertCard() {
        System.out.println("Card inserted");
        atm.setState(new CardInsertedState(atm));
    }

    /**
     * Handles the event of a card ejection.
     * In this state, it does nothing as there is no card inserted.
     */
    @Override
    public void ejectCard() {
        System.out.println("No card inserted");
    }

    /**
     * Handles the event of a pin insertion.
     * In this state, it does nothing as there is no card inserted.
     * @param pin The pin to be inserted.
     */
    @Override
    public void insertPin(int pin) {
        System.out.println("No card inserted");
    }

    /**
     * Handles the event of a cash request.
     * In this state, it does nothing as there is no card inserted.
     * @param amount The amount of cash to be requested.
     */
    @Override
    public void requestCash(int amount) {
        System.out.println("No card inserted");
    }
}