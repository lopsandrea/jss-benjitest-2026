package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class009Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class009().compute(3));
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class009().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class009().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class009().capacity());
    }

    @Test
    void rejectsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class009().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class009().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class009().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class009().merge(2, 5));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class009().compute(3));
    }

}
