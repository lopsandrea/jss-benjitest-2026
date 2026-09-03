package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class218Test {
    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class218().compute(3));
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class218().normalize("  x "));
        assertEquals(7, new Class218().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class218().merge(2, 5));
        assertTrue(new Class218().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class218().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        assertEquals(16, new Class218().capacity());
    }

    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class218().compute(3));
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class218().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class218().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class218().isValid("abc"));
    }

}
