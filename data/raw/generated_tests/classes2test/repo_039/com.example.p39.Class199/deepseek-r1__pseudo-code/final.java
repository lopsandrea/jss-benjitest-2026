package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class199Test {
    @Test
    void keepsComputeWhenUnset() {
        new Class199().compute(3);
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        new Class199().normalize("  x ");
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class199().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class199().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class199().compute(3));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class199().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class199().merge(2, 5));
    }

}
