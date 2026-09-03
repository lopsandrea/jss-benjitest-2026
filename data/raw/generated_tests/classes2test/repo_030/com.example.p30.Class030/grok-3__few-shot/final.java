package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class030Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        new Class030().compute(3);
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class030().normalize("  x "));
        assertEquals(7, new Class030().merge(2, 5));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class030().merge(2, 5));
        assertTrue(new Class030().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class030().isValid("abc"));
        assertEquals(16, new Class030().capacity());
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class030().capacity());
    }

    @Test
    void reportsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class030().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class030().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class030().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class030().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class030().isValid("abc"));
    }

}
