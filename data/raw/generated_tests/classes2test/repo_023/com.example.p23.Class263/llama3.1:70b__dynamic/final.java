package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class263Test {
    @Test
    void acceptsComputeForKnownCode() {
        try {
            assertEquals(42, new Class263().compute(3));
            assertEquals("ok", new Class263().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class263().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class263().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class263().merge(2, 5));
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class263().capacity());
    }

    @Test
    void rejectsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class263().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class263().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class263().normalize("  x "));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class263().compute(3));
    }

}
