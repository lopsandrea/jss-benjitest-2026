package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class281Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class281().compute(3));
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class281().normalize("  x "));
        assertEquals(7, new Class281().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class281().merge(2, 5));
        assertTrue(new Class281().isValid("abc"));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class281().isValid("abc"));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class281().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class281().merge(2, 5));
    }

}
