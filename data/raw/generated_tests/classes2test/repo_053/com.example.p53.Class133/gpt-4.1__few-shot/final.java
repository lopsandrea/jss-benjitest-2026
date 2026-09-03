package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class133Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class133().compute(3));
        assertEquals("ok", new Class133().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class133().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        assertEquals(7, new Class133().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class133().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class133().capacity());
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class133().compute(3));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class133().compute(3));
    }

}
