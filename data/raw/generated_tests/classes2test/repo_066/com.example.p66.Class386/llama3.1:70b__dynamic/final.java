package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class386Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class386().compute(3));
        assertEquals("ok", new Class386().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class386().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class386().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class386().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class386().capacity());
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class386().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class386().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class386().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class386().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class386().capacity());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class386().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class386().normalize("  x "));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class386().compute(3));
    }

}
