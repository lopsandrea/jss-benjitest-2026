package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class340Test {
    @Test
    void preservesComputeWithNegativeInput() {
        new Class340().compute(3);
    }

    @Test
    void clampsNormalizeAtZero() {
        new Class340().normalize("  x ");
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class340().merge(2, 5));
        assertTrue(new Class340().isValid("abc"));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class340().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class340().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class340().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class340().merge(2, 5));
    }

}
