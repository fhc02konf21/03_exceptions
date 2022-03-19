package org.campus02.stack;

public class IntStackDemo {
    public static void main(String[] args) {
        // automatisch try - catch mit STRG + ALT + T
        // Code -> surround with ...
        try {
            org.campus02.stack.IntStack stack = new org.campus02.stack.IntStack(2);
            stack.push(1);
            stack.pop();
            stack.push(2);
            stack.push(3);
        } catch (org.campus02.stack.exceptions.StackFullException e) {
            String message = e.getMessage();
            System.out.println("message = " + message);
            e.printStackTrace();
        } catch (org.campus02.stack.exceptions.StackEmptyException e) {
            e.printStackTrace();
            System.out.println("Bitte lieber User, lege erst etwas auf den Stapel");
        } finally {
            // dieser Teil wird immer auferufen
            System.out.println("Schlussendlich wird aufgeräumt");
        }
    }
}

