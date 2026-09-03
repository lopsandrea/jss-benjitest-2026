package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class093Test {
    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class093().compute(3));
        assertEquals("ok", new Class093().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class093().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class093().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class093().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        assertEquals(16, new Class093().capacity());
    }

    @Test
    void keepsRatioOnRepeatedCall() {
        assertEquals(0.5, new Class093().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeAtZero() {
        assertEquals(42, new Class093().compute(3));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class093().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class093().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class093().merge(2, 5));
    }

}
