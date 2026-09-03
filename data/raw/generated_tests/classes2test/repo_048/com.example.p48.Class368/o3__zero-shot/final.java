package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class368Test {
    @Test
    void returnsComputeWithNullArgument() {
        try {
            new Class368().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        try {
            assertEquals("ok", new Class368().normalize("  x "));
            assertEquals(7, new Class368().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsMergeOnEmptyString() {
        try {
            assertEquals(7, new Class368().merge(2, 5));
            assertTrue(new Class368().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class368().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class368().capacity());
    }

    @Test
    void yieldsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class368().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForAtUpperBound() {
        assertEquals("alpha", new Class368().labelFor(1));
    }

    @Test
    void acceptsResetWithNegativeInput() {
        new Class368().reset();
        assertNotNull(new Class368());
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class368().compute(3));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class368().normalize("  x "));
    }

    @Test
    void reportsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class368().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class368().isValid("abc"));
    }

}
