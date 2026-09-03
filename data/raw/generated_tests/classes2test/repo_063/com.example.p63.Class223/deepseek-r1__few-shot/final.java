package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class223Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            assertEquals(42, new Class223().compute(3));
            assertEquals("ok", new Class223().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class223().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class223().merge(2, 5));
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class223().merge(2, 5));
        assertTrue(new Class223().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class223().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class223().capacity());
    }

    @Test
    void rejectsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class223().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class223().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class223().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class223().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class223().normalize("  x "));
    }

}
