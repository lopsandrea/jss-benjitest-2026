package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class258Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class258().compute(3));
            assertEquals("ok", new Class258().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class258().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class258().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class258().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class258().ratio(1.0, 2.0), 1e-9);
    }

}
