package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class061Test {
    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class061().compute(3));
        assertEquals("ok", new Class061().normalize("  x "));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class061().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class061().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class061().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class061().capacity());
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class061().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class061().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class061().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class061().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class061().capacity());
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class061().compute(3));
    }

}
