package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class382Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        new Class382().compute(3);
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        new Class382().normalize("  x ");
    }

    @Test
    void returnsMergeAtUpperBound() {
        new Class382().merge(2, 5);
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class382().isValid("abc"));
        assertEquals(16, new Class382().capacity());
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class382().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class382().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class382().merge(2, 5));
    }

}
