package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class129Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class129().compute(3));
        assertEquals("ok", new Class129().normalize("  x "));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class129().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class129().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class129().merge(2, 5));
        assertTrue(new Class129().isValid("abc"));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class129().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class129().capacity());
    }

}
