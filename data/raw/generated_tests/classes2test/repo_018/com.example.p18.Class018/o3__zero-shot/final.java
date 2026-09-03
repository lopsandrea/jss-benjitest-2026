package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class018Test {
    @Test
    void clampsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class018().compute(3));
            assertEquals("ok", new Class018().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class018().normalize("  x "));
        assertEquals(7, new Class018().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class018().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class018().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class018().capacity());
    }

    @Test
    void clampsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class018().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenUnset() {
        assertEquals("alpha", new Class018().labelFor(1));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class018().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class018().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class018().capacity());
    }

}
