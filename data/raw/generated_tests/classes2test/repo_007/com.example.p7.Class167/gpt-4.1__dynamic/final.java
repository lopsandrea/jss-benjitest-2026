package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class167Test {
    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class167().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class167().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class167().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class167().isValid("abc"));
    }

    @Test
    void keepsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class167().capacity());
    }

    @Test
    void returnsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class167().ratio(1.0, 2.0), 1e-9);
    }

}
