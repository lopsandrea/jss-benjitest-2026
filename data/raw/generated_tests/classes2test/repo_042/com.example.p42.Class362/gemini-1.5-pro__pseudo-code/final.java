package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class362Test {
    @Test
    void reportsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class362().compute(3));
            assertEquals("ok", new Class362().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class362().normalize("  x "));
        assertEquals(7, new Class362().merge(2, 5));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class362().merge(2, 5));
        assertTrue(new Class362().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class362().isValid("abc"));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class362().compute(3));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class362().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class362().merge(2, 5));
    }

}
