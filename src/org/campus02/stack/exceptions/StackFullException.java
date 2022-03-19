package org.campus02.stack.exceptions;

/**
 * Exception soll geworfen werden, wenn der Stack voll ist
 */
public class StackFullException extends Exception {
    public StackFullException() {
    }

    public StackFullException(String message) {
        super(message);
    }
}
