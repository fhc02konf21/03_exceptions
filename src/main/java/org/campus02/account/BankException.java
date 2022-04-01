package org.campus02.account;

public class BankException extends Exception {

    /** Konstruktor für eigene Nachrichten
     *
     * @param message definierte Nachricht
     */
    public BankException(String message) {
        super(message);
    }

    /**
     * Konstruktor für Nachrichten und Exception chaining
     * Aneinanderreihen (einpacken) von Exceptions (siehe Foliensatz 03_exceptions -> chaining)
     *
     * @param message definierte Nachricht
     * @param cause anzuhängende Exception
     */
    public BankException(String message, Throwable cause) {
        super(message, cause);
    }
}
