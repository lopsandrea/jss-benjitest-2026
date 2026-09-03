package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class012Test {
    @Test
    void reportsComputeOnRepeatedCall() {
        new Class012().compute(3);
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        new Class012().normalize("  x ");
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class012().merge(2, 5));
        assertTrue(new Class012().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNullArgument() {
        assertTrue(new Class012().isValid("abc"));
    }

    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class012().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class012().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class012().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class012().isValid("abc"));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        assertEquals(42, new Class012().compute(3));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class012().compute(3));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class012().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class012().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class012().isValid("abc"));
    }

}
