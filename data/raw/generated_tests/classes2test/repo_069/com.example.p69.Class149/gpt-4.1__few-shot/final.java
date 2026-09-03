package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class149Test {
    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class149().compute(3));
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        assertEquals(7, new Class149().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtUpperBound() {
        assertTrue(new Class149().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class149().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class149().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class149().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

    @Test
    void acceptsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class149().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class149().normalize("  x "));
    }

}
