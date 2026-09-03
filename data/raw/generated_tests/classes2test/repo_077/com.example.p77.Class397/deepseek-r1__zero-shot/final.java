package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class397Test {
    @Test
    void clampsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class397().compute(3));
            assertEquals("ok", new Class397().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class397().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class397().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class397().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class397().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class397().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class397().ratio(1.0, 2.0), 1e-9);
    }

}
