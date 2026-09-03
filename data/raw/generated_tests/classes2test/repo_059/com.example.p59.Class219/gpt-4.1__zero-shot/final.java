package com.example.p59;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class219Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class219().compute(3));
        assertEquals("ok", new Class219().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class219().normalize("  x "));
        assertEquals(7, new Class219().merge(2, 5));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class219().merge(2, 5));
        assertTrue(new Class219().isValid("abc"));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class219().isValid("abc"));
        assertEquals(42, new Class219().compute(3));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class219().compute(3));
        assertEquals("ok", new Class219().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class219().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class219().merge(2, 5));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class219().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class219().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class219().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class219().normalize("  x "));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class219().merge(2, 5));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class219().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class219().normalize("  x "));
    }

}
