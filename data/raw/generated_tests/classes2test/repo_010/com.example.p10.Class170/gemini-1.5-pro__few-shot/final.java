package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {
    @Test
    void rejectsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class170().compute(3));
            assertEquals("ok", new Class170().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class170().normalize("  x "));
            assertEquals(7, new Class170().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeOnMixedCase() {
        try {
            assertEquals(7, new Class170().merge(2, 5));
            assertTrue(new Class170().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class170().isValid("abc"));
        assertEquals(16, new Class170().capacity());
    }

    @Test
    void returnsCapacityForKnownCode() {
        assertEquals(16, new Class170().capacity());
        assertEquals(0.5, new Class170().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioWithNegativeInput() {
        assertEquals(0.5, new Class170().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class170().labelFor(1));
    }

    @Test
    void clampsLabelForAtZero() {
        assertEquals("alpha", new Class170().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class170().compute(3));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class170().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class170().merge(2, 5));
    }

}
