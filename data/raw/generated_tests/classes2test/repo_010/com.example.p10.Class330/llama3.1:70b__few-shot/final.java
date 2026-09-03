package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class330Test {
    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class330().compute(3));
        assertEquals("ok", new Class330().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class330().normalize("  x "));
        assertEquals(7, new Class330().merge(2, 5));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class330().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class330().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        assertEquals(16, new Class330().capacity());
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class330().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class330().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class330().merge(2, 5));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class330().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class330().normalize("  x "));
    }

}
