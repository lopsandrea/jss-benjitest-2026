package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class376Test {
    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class376().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class376().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class376().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class376().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class376().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class376().labelFor(1));
    }

    @Test
    void reportsResetForKnownCode() {
        new Class376().reset();
        assertNotNull(new Class376());
    }

}
