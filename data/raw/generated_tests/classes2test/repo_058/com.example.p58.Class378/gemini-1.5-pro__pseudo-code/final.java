package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class378Test {
    @Test
    void reportsComputeWhenUnset() {
        new Class378().compute(3);
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class378().normalize("  x "));
        assertEquals(7, new Class378().merge(2, 5));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        assertEquals(7, new Class378().merge(2, 5));
        assertTrue(new Class378().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class378().isValid("abc"));
        assertEquals(16, new Class378().capacity());
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        assertEquals(16, new Class378().capacity());
    }

    @Test
    void preservesRatioAtZero() {
        assertEquals(0.5, new Class378().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForAtZero() {
        assertEquals("alpha", new Class378().labelFor(1));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class378().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class378().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class378().merge(2, 5));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class378().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class378().normalize("  x "));
    }

}
