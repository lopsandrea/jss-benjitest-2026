package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {
    @Test
    void clampsComputeOnEmptyString() {
        new Class338().compute(3);
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        new Class338().normalize("  x ");
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class338().merge(2, 5));
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class338().isValid("abc"));
        assertEquals(16, new Class338().capacity());
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        assertEquals(16, new Class338().capacity());
        assertEquals(0.5, new Class338().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioAtUpperBound() {
        assertEquals(0.5, new Class338().ratio(1.0, 2.0), 1e-9);
        assertEquals(42, new Class338().compute(3));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class338().compute(3));
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class338().normalize("  x "));
        assertEquals(7, new Class338().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class338().merge(2, 5));
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class338().isValid("abc"));
        assertEquals(16, new Class338().capacity());
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class338().capacity());
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class338().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class338().merge(2, 5));
    }

}
