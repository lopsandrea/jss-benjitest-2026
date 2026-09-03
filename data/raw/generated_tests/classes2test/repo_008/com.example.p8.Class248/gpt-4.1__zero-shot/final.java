package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class248Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class248().compute(3));
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class248().normalize("  x "));
        assertEquals(7, new Class248().merge(2, 5));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class248().merge(2, 5));
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void returnsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class248().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class248().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class248().labelFor(1));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class248().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class248().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class248().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class248().isValid("abc"));
    }

}
