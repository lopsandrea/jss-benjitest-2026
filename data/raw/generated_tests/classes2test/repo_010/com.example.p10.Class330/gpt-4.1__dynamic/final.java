package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class330Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class330().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class330().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class330().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class330().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnMixedCase() {
        assertEquals(16, new Class330().capacity());
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class330().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class330().normalize("  x "));
    }

}
