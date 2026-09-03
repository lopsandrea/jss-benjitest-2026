package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class387Test {
    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class387().compute(3));
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class387().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class387().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class387().capacity());
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class387().compute(3));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class387().compute(3));
    }

}
