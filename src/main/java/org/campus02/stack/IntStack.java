package org.campus02.stack;

import org.campus02.stack.exceptions.StackEmptyException;
import org.campus02.stack.exceptions.StackFullException;

import javax.management.InstanceAlreadyExistsException;
import java.util.Arrays;

public class IntStack {
    private int[] stack;
    private int pointer;

    public IntStack(int maxSize) {
        this.stack = new int[maxSize];
        this.pointer = -1;
    }

    public void push(int value) throws StackFullException {
        // wenn der pointer gleich der stack länge - 1 ist
        // dann soll eine Exception geworfen werden
        if (pointer == stack.length - 1) {
            throw new StackFullException("Stack ist voll");
        }
        stack[++pointer] = value;
    }

    public int pop() throws StackEmptyException {
        // wirf eine Exception, wenn der pointer auf -1 ist
        if (pointer == -1) {
            throw new StackEmptyException("Stack leer");
        }
        int value = stack[pointer];
        stack[pointer--] = 0;
        return value;
    }

    @Override
    public String toString() {
        return "IntStack{" +
                "stack=" + Arrays.toString(stack) +
                '}';
    }
}
