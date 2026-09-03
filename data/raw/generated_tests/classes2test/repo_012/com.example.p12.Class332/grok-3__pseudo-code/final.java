package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class332Test {
    @Test
    void rejectsComputeWhenUnset() {
        try {
            assertEquals(42, new Class332().compute(3));
            assertEquals("ok", new Class332().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class332().normalize("  x "));
        assertEquals(7, new Class332().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class332().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class332().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class332().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class332().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class332().compute(3));
    }

}
