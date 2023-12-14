package org.example;

/**
 * The CardInsertedState class represents the state of the ATM when a card is inserted.
 * It extends the ATMState class and overrides its methods to provide the specific behavior for this state.
 */
public class CardInsertedState extends ATMState {

    /**
     * Constructs a new CardInsertedState for the given ATM.
     * @param atm The ATM this state belongs to.
     */
    public CardInsertedState(ATM atm) {
        super(atm);
    }

    /**
     * Handles the event of a card insertion.
     * In this state, it does nothing as a card is already inserted.
     */
    @Override
    public void insertCard() {
        System.out.println("Card already inserted");
    }

    /**
     * Handles the event of a card ejection.
     * In this state, it changes the state of the ATM to NoCardState.
     */
    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atm.setState(new NoCardState(atm));
    }

    /**
     * Handles the event of a pin insertion.
     * In this state, it changes the state of the ATM to PinInsertedState.
     * @param pin The pin to be inserted.
     */
    @Override
    public void insertPin(int pin) {
        System.out.println("Pin inserted");
        atm.setState(new PinInsertedState(atm));
    }

    /**
     * Handles the event of a cash request.
     * In this state, it does nothing as the pin is not inserted.
     * @param amount The amount of cash to be requested.
     */
    @Override
    public void requestCash(int amount) {
        System.out.println("Pin not inserted");
    }
}