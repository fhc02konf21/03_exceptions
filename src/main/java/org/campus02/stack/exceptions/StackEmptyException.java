package org.campus02.stack.exceptions;

/**
 * Diese Exception soll geworfen werden, wenn der Stack leer ist
 *
 * Ableitung von Excepion
 */
public class StackEmptyException extends Exception {

    // Überladung der Konstruktoren
    public StackEmptyException() {
    }

    public StackEmptyException(String message) {
        super(message);
    }
}
