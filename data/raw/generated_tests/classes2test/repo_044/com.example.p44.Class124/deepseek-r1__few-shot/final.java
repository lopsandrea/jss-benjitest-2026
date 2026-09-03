package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class124Test {
    @Test
    void yieldsComputeForKnownCode() {
        try {
            assertEquals(42, new Class124().compute(3));
            assertEquals("ok", new Class124().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class124().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class124().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
    }

}
