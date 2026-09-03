package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class365Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class365().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class365().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class365().isValid("abc"));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class365().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

}
