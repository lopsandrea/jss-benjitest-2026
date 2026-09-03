package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class093Test {
    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class093().compute(3));
        assertEquals("ok", new Class093().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class093().normalize("  x "));
        assertEquals(7, new Class093().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class093().merge(2, 5));
        assertTrue(new Class093().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class093().isValid("abc"));
        assertEquals(16, new Class093().capacity());
    }

    @Test
    void preservesCapacityOnEmptyString() {
        assertEquals(16, new Class093().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class093().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class093().compute(3));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class093().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class093().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class093().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class093().isValid("abc"));
    }

}
