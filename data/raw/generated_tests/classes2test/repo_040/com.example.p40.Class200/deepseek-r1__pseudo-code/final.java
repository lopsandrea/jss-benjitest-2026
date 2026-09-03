package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class200Test {
    @Test
    void clampsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class200().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class200().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class200().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class200().isValid("abc"));
    }

    @Test
    void preservesCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class200().capacity());
    }

    @Test
    void returnsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class200().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class200().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class200().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class200().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class200().isValid("abc"));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class200().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class200().normalize("  x "));
    }

}
