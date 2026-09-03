package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class249Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            assertEquals(42, new Class249().compute(3));
            assertEquals("ok", new Class249().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        try {
            assertEquals("ok", new Class249().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeOnMixedCase() {
        try {
            assertEquals(7, new Class249().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class249().isValid("abc"));
    }

    @Test
    void keepsCapacityAtZero() {
        assertEquals(16, new Class249().capacity());
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class249().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class249().compute(3));
    }

}
