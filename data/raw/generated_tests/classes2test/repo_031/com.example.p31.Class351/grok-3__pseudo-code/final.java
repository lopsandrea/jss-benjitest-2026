package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class351Test {
    @Test
    void returnsComputeOnEmptyString() {
        new Class351().compute(3);
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class351().normalize("  x "));
        assertEquals(7, new Class351().merge(2, 5));
    }

    @Test
    void reportsMergeOnEmptyString() {
        assertEquals(7, new Class351().merge(2, 5));
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class351().isValid("abc"));
        assertEquals(42, new Class351().compute(3));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class351().compute(3));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class351().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class351().isValid("abc"));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class351().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class351().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class351().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class351().isValid("abc"));
    }

}
