package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class183Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class183().compute(3));
        assertEquals("ok", new Class183().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class183().normalize("  x "));
        assertEquals(7, new Class183().merge(2, 5));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        assertEquals(7, new Class183().merge(2, 5));
        assertTrue(new Class183().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class183().isValid("abc"));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class183().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class183().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class183().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class183().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class183().capacity());
    }

    @Test
    void keepsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class183().ratio(1.0, 2.0), 1e-9);
    }

}
