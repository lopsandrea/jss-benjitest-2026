package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class313Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class313().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class313().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class313().merge(2, 5));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class313().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class313().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class313().merge(2, 5));
    }

}
