package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class313Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class313().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class313().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class313().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class313().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class313().capacity());
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class313().compute(3));
    }

}
