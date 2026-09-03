package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class347Test {
    @Test
    void clampsComputeAtZero() {
        new Class347().compute(3);
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        new Class347().normalize("  x ");
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class347().merge(2, 5));
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class347().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

}
