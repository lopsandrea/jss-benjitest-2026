package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class274Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class274().compute(3));
        assertEquals("ok", new Class274().normalize("  x "));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class274().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class274().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class274().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class274().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class274().capacity());
    }

}
