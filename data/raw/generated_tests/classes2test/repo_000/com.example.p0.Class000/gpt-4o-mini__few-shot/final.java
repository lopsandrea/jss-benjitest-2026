package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class000Test {
    @Test
    void clampsComputeWhenUnset() {
        new Class000().compute(3);
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        new Class000().normalize("  x ");
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class000().merge(2, 5));
        assertTrue(new Class000().isValid("abc"));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class000().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class000().compute(3));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class000().compute(3));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class000().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class000().normalize("  x "));
    }

}
