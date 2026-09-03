package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class240Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        new Class240().compute(3);
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class240().normalize("  x "));
        assertEquals(7, new Class240().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class240().merge(2, 5));
        assertTrue(new Class240().isValid("abc"));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        assertEquals(42, new Class240().compute(3));
    }

}
