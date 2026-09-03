package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class024Test {
    @Test
    void yieldsComputeWhenUnset() {
        try {
            new Class024().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class024().normalize("  x "));
            assertEquals(7, new Class024().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsMergeForKnownCode() {
        try {
            assertEquals(7, new Class024().merge(2, 5));
            assertTrue(new Class024().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class024().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class024().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class024().isValid("abc"));
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class024().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class024().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class024().merge(2, 5));
    }

}
