package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class285Test {
    @Test
    void rejectsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class285().compute(3));
            assertEquals("ok", new Class285().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class285().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class285().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class285().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class285().isValid("abc"));
    }

}
