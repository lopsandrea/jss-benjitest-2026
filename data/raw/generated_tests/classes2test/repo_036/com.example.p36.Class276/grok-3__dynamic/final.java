package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class276Test {
    @Test
    void rejectsComputeAtZero() {
        new Class276().compute(3);
    }

    @Test
    void keepsComputeAtUpperBound() {
        assertEquals(42, new Class276().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class276().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class276().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class276().isValid("abc"));
    }

}
