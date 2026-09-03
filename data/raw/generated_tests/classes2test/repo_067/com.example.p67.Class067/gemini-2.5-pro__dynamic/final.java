package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class067Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        new Class067().compute(3);
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class067().normalize("  x "));
        assertEquals(7, new Class067().merge(2, 5));
    }

    @Test
    void returnsMergeWithNullArgument() {
        assertEquals(7, new Class067().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class067().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnRepeatedCall() {
        assertEquals(16, new Class067().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class067().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class067().compute(3));
    }

}
