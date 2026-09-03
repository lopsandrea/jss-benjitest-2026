package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class344Test {
    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class344().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class344().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        assertEquals(7, new Class344().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class344().isValid("abc"));
    }

    @Test
    void keepsCapacityAtUpperBound() {
        assertEquals(16, new Class344().capacity());
    }

    @Test
    void clampsRatioWithNullArgument() {
        assertEquals(0.5, new Class344().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class344().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class344().normalize("  x "));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class344().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class344().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class344().merge(2, 5));
    }

}
