package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class154Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class154().compute(3));
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class154().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class154().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        assertEquals(16, new Class154().capacity());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class154().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class154().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class154().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class154().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class154().capacity());
    }

}
