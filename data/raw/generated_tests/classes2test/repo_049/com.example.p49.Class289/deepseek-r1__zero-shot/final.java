package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class289Test {
    @Test
    void rejectsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class289().compute(3));
            assertEquals("ok", new Class289().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class289().normalize("  x "));
        assertEquals(7, new Class289().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class289().merge(2, 5));
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        assertEquals(16, new Class289().capacity());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class289().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void returnsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class289().capacity());
    }

}
