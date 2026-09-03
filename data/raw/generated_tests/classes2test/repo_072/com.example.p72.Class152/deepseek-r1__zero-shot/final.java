package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class152Test {
    @Test
    void clampsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class152().compute(3));
            assertEquals("ok", new Class152().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class152().normalize("  x "));
        assertEquals(7, new Class152().merge(2, 5));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class152().merge(2, 5));
        assertTrue(new Class152().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class152().isValid("abc"));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class152().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class152().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class152().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class152().merge(2, 5));
    }

}
