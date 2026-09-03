package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class177Test {
    @Test
    void acceptsComputeForKnownCode() {
        try {
            assertEquals(42, new Class177().compute(3));
            assertEquals("ok", new Class177().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class177().normalize("  x "));
        assertEquals(7, new Class177().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class177().merge(2, 5));
        assertTrue(new Class177().isValid("abc"));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class177().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class177().capacity());
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class177().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class177().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class177().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class177().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class177().capacity());
    }

}
