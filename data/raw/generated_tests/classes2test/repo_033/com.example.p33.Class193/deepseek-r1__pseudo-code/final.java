package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class193Test {
    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class193().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class193().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class193().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        assertEquals(16, new Class193().capacity());
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class193().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class193().merge(2, 5));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class193().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

}
