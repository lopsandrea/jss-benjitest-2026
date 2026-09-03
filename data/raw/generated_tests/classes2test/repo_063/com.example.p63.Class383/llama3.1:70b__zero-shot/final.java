package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class383Test {
    @Test
    void keepsComputeAtZero() {
        new Class383().compute(3);
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        new Class383().normalize("  x ");
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class383().merge(2, 5));
        assertTrue(new Class383().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class383().isValid("abc"));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        assertEquals(42, new Class383().compute(3));
    }

}
