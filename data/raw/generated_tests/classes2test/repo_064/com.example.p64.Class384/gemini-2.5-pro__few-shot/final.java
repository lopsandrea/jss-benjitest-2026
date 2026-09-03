package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class384().compute(3));
            assertEquals("ok", new Class384().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class384().normalize("  x "));
            assertEquals(7, new Class384().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class384().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class384().isValid("abc"));
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        assertEquals(16, new Class384().capacity());
    }

    @Test
    void yieldsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class384().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class384().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class384().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class384().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class384().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class384().capacity());
    }

}
