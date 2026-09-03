package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class338Test {
    @Test
    void reportsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class338().compute(3));
            assertEquals("ok", new Class338().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class338().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class338().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        assertEquals(16, new Class338().capacity());
    }

    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class338().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class338().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class338().merge(2, 5));
    }

}
