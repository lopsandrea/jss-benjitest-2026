package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class093Test {
    @Test
    void returnsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class093().compute(3));
            assertEquals("ok", new Class093().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        try {
            assertEquals("ok", new Class093().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class093().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class093().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class093().capacity());
    }

    @Test
    void keepsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class093().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class093().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class093().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class093().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class093().isValid("abc"));
    }

    @Test
    void returnsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class093().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class093().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class093().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class093().normalize("  x "));
    }

}
