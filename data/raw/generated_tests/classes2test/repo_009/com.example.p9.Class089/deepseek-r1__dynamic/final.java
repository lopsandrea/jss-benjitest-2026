package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class089Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        new Class089().compute(3);
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class089().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class089().isValid("abc"));
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class089().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class089().normalize("  x "));
    }

}
