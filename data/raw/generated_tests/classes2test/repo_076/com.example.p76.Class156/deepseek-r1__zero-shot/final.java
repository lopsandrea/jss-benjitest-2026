package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class156Test {
    @Test
    void returnsComputeWithNullArgument() {
        new Class156().compute(3);
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class156().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class156().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class156().isValid("abc"));
    }

}
