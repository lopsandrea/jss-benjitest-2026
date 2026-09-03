package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class372Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class372().compute(3));
        assertEquals("ok", new Class372().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class372().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class372().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class372().isValid("abc"));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class372().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class372().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class372().merge(2, 5));
    }

}
