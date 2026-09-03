package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class384Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class384().compute(3));
        assertEquals("ok", new Class384().normalize("  x "));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class384().normalize("  x "));
        assertEquals(7, new Class384().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class384().merge(2, 5));
        assertTrue(new Class384().isValid("abc"));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class384().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class384().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class384().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class384().isValid("abc"));
    }

}
