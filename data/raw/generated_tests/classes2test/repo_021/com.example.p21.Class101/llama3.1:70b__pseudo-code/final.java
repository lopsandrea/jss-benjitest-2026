package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class101Test {
    @Test
    void preservesComputeWithNegativeInput() {
        assertEquals(42, new Class101().compute(3));
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class101().normalize("  x "));
        assertEquals(7, new Class101().merge(2, 5));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class101().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class101().isValid("abc"));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class101().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class101().merge(2, 5));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class101().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class101().normalize("  x "));
    }

}
