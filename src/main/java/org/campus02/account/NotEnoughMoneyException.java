package org.campus02.account;

/**
 * Exception for not enough money
 */
public class NotEnoughMoneyException extends Exception {

    /**
     * Konstruktor um definierte Nachrichten ("message") der Exception mitzugeben
     * @param message
     */
    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
