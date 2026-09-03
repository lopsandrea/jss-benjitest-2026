package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class399Test {
    @Test
    void clampsComputeWithNegativeInput() {
        new Class399().compute(3);
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class399().normalize("  x "));
        assertEquals(7, new Class399().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class399().merge(2, 5));
        assertTrue(new Class399().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class399().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class399().capacity());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class399().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class399().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class399().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class399().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class399().capacity());
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class399().compute(3));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class399().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class399().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class399().merge(2, 5));
    }

}
