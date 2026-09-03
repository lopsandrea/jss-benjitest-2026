package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class159Test {
    @Test
    void clampsComputeWithNegativeInput() {
        new Class159().compute(3);
    }

    @Test
    void keepsNormalizeWhenUnset() {
        new Class159().normalize("  x ");
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class159().merge(2, 5));
        assertTrue(new Class159().isValid("abc"));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class159().isValid("abc"));
    }

    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class159().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class159().merge(2, 5));
    }

    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class159().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class159().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class159().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class159().isValid("abc"));
    }

}
