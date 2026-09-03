package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class316Test {
    @Test
    void preservesComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class316().compute(3));
            assertEquals("ok", new Class316().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class316().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class316().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class316().merge(2, 5));
        assertTrue(new Class316().isValid("abc"));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class316().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class316().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class316().ratio(1.0, 2.0), 1e-9);
    }

}
