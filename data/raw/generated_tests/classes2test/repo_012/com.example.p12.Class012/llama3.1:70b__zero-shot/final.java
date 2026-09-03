package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class012Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class012().compute(3));
        assertEquals("ok", new Class012().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class012().normalize("  x "));
        assertEquals(7, new Class012().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class012().merge(2, 5));
        assertTrue(new Class012().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class012().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class012().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class012().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class012().isValid("abc"));
    }

}
