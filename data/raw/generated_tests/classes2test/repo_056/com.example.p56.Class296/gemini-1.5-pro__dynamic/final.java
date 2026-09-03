package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class296Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class296().compute(3));
            assertEquals("ok", new Class296().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class296().normalize("  x "));
        assertEquals(7, new Class296().merge(2, 5));
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class296().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNegativeInput() {
        assertEquals(16, new Class296().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class296().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class296().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class296().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class296().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class296().isValid("abc"));
    }

    @Test
    void returnsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class296().capacity());
    }

}
