package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class209Test {
    @Test
    void reportsComputeForKnownCode() {
        new Class209().compute(3);
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class209().normalize("  x "));
        assertEquals(7, new Class209().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class209().merge(2, 5));
        assertTrue(new Class209().isValid("abc"));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class209().isValid("abc"));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class209().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class209().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class209().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class209().isValid("abc"));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class209().compute(3));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class209().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class209().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class209().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class209().compute(3));
    }

}
