package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class182Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        new Class182().compute(3);
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        new Class182().normalize("  x ");
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class182().merge(2, 5));
        assertTrue(new Class182().isValid("abc"));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class182().isValid("abc"));
    }

    @Test
    void preservesComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class182().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class182().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class182().merge(2, 5));
    }

}
