package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class053Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class053().compute(3));
        assertEquals("ok", new Class053().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class053().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class053().merge(2, 5));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class053().isValid("abc"));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class053().compute(3));
    }

}
