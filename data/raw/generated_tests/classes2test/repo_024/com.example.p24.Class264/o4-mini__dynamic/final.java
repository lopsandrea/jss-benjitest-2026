package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class264Test {
    @Test
    void acceptsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class264().compute(3));
            assertEquals("ok", new Class264().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class264().normalize("  x "));
        assertEquals(7, new Class264().merge(2, 5));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class264().merge(2, 5));
        assertTrue(new Class264().isValid("abc"));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class264().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class264().capacity());
    }

    @Test
    void acceptsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class264().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class264().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class264().normalize("  x "));
    }

}
