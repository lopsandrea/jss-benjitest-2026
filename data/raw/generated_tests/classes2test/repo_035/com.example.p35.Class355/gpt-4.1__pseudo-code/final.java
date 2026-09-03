package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class355Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class355().compute(3));
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class355().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class355().isValid("abc"));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class355().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class355().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class355().isValid("abc"));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class355().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class355().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class355().merge(2, 5));
    }

}
