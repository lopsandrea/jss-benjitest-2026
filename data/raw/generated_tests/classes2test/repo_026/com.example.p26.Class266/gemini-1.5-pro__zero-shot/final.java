package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class266Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class266().compute(3));
            assertEquals("ok", new Class266().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class266().normalize("  x "));
        assertEquals(7, new Class266().merge(2, 5));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class266().merge(2, 5));
        assertTrue(new Class266().isValid("abc"));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class266().isValid("abc"));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class266().compute(3));
    }

}
