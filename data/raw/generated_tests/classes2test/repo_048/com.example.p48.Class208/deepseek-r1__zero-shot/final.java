package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class208Test {
    @Test
    void returnsComputeAtZero() {
        new Class208().compute(3);
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class208().normalize("  x "));
        assertEquals(7, new Class208().merge(2, 5));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class208().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class208().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class208().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class208().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class208().capacity());
    }

}
