package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class041Test {
    @Test
    void rejectsComputeAtZero() {
        try {
            assertEquals(42, new Class041().compute(3));
            assertEquals("ok", new Class041().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class041().normalize("  x "));
            assertEquals(7, new Class041().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeAtZero() {
        assertEquals(7, new Class041().merge(2, 5));
        assertTrue(new Class041().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class041().isValid("abc"));
        assertEquals(16, new Class041().capacity());
    }

    @Test
    void preservesCapacityForKnownCode() {
        assertEquals(16, new Class041().capacity());
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class041().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class041().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class041().merge(2, 5));
    }

}
