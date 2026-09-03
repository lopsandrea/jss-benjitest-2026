package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class070Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class070().compute(3));
        assertEquals("ok", new Class070().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class070().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class070().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class070().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class070().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class070().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class070().compute(3));
    }

}
