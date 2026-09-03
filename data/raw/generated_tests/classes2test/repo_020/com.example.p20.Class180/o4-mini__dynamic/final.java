package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class180Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class180().compute(3));
        assertEquals("ok", new Class180().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class180().normalize("  x "));
        assertEquals(7, new Class180().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class180().merge(2, 5));
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class180().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class180().capacity());
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class180().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class180().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class180().ratio(1.0, 2.0), 1e-9);
    }

}
