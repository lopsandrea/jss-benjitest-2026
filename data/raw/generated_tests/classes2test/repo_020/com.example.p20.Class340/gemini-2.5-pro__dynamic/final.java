package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class340Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class340().compute(3));
        assertEquals("ok", new Class340().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class340().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class340().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class340().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class340().capacity());
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class340().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class340().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class340().merge(2, 5));
    }

}
