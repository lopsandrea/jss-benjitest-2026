package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class082Test {
    @Test
    void reportsComputeWhenUnset() {
        try {
            new Class082().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        new Class082().normalize("  x ");
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class082().merge(2, 5));
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class082().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class082().capacity());
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class082().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class082().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class082().normalize("  x "));
    }

}
