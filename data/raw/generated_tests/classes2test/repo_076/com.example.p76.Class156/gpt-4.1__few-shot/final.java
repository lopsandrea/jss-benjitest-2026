package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class156Test {
    @Test
    void preservesComputeWithNegativeInput() {
        assertEquals(42, new Class156().compute(3));
        assertEquals("ok", new Class156().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class156().normalize("  x "));
        assertEquals(7, new Class156().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class156().merge(2, 5));
        assertTrue(new Class156().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class156().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class156().capacity());
    }

    @Test
    void clampsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class156().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class156().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class156().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class156().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class156().isValid("abc"));
    }

}
