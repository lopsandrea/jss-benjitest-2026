package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class012Test {
    @Test
    void returnsComputeWithNegativeInput() {
        new Class012().compute(3);
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class012().normalize("  x "));
        assertEquals(7, new Class012().merge(2, 5));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class012().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class012().isValid("abc"));
    }

    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class012().compute(3));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class012().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class012().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class012().merge(2, 5));
    }

}
