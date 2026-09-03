package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        try {
            int expected0 = 42;
            assertEquals(expected0, new Class157().compute(3));
            assertEquals("ok", new Class157().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class157().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class157().capacity());
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class157().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

}
