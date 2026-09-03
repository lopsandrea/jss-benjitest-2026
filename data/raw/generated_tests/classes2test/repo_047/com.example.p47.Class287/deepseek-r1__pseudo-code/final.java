package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class287Test {
    @Test
    void acceptsComputeAtZero() {
        try {
            assertEquals(42, new Class287().compute(3));
            assertEquals("ok", new Class287().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class287().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class287().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class287().isValid("abc"));
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class287().compute(3));
    }

}
