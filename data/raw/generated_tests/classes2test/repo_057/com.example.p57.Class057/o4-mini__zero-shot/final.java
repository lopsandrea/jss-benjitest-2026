package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class057Test {
    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class057().compute(3));
        assertEquals("ok", new Class057().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class057().normalize("  x "));
        assertEquals(7, new Class057().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class057().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class057().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        assertEquals(16, new Class057().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class057().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class057().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class057().normalize("  x "));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class057().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class057().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class057().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class057().isValid("abc"));
    }

    @Test
    void preservesCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class057().capacity());
    }

    @Test
    void rejectsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class057().ratio(1.0, 2.0), 1e-9);
    }

}
