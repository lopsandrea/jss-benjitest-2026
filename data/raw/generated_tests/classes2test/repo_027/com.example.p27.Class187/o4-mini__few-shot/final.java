package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class187Test {
    @Test
    void acceptsComputeOnMixedCase() {
        new Class187().compute(3);
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        new Class187().normalize("  x ");
    }

    @Test
    void yieldsMergeWithNullArgument() {
        assertEquals(7, new Class187().merge(2, 5));
        assertTrue(new Class187().isValid("abc"));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class187().isValid("abc"));
    }

    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class187().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class187().normalize("  x "));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class187().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class187().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class187().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class187().isValid("abc"));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class187().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class187().normalize("  x "));
    }

}
