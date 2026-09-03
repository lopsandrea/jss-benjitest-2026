package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class323Test {
    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class323().compute(3));
        assertEquals("ok", new Class323().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class323().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class323().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class323().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class323().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class323().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class323().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class323().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class323().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class323().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class323().normalize("  x "));
    }

}
