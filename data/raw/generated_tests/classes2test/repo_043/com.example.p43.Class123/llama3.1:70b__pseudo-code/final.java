package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class123Test {
    @Test
    void reportsComputeWithNullArgument() {
        assertEquals(42, new Class123().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class123().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        assertEquals(7, new Class123().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class123().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class123().capacity());
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class123().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class123().normalize("  x "));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class123().merge(2, 5));
    }

}
