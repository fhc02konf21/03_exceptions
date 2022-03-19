package org.campus02.stack;

import org.campus02.stack.exceptions.StackFullException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntStackTest {

    private IntStack stack;

    @BeforeEach
    void setUp() {
        stack = new IntStack(2);
    }

    @Test
    void pushWithException() {
        StackFullException stackFullException = assertThrows(StackFullException.class, () -> {
            stack.push(1);
            stack.push(1);
            stack.push(1);
            stack.push(1);
            stack.push(1);
        });

        assertEquals(stackFullException.getMessage(), "Stack ist voll");
    }
}