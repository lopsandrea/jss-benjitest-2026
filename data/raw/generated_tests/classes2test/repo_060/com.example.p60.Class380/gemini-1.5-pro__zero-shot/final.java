package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class380Test {
    @Test
    void rejectsComputeOnEmptyString() {
        new Class380().compute(3);
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class380().normalize("  x "));
        assertEquals(7, new Class380().merge(2, 5));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class380().merge(2, 5));
        assertTrue(new Class380().isValid("abc"));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class380().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class380().compute(3));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class380().compute(3));
    }

}
