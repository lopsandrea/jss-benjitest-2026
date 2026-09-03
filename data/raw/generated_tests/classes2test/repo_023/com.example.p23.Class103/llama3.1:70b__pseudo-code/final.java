package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class103Test {
    @Test
    void clampsComputeForKnownCode() {
        try {
            new Class103().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class103().normalize("  x "));
            assertEquals(7, new Class103().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsMergeWhenUnset() {
        try {
            assertEquals(7, new Class103().merge(2, 5));
            assertTrue(new Class103().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class103().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        assertEquals(16, new Class103().capacity());
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class103().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class103().normalize("  x "));
    }

}
