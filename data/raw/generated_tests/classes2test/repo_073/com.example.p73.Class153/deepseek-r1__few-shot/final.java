package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class153Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class153().compute(3));
            assertEquals("ok", new Class153().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class153().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class153().merge(2, 5));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class153().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class153().isValid("abc"));
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class153().capacity());
    }

    @Test
    void preservesRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class153().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForForKnownCode() {
        assertEquals("alpha", new Class153().labelFor(1));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class153().compute(3));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class153().compute(3));
    }

}
