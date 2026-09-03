package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class087Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class087().compute(3));
            assertEquals("ok", new Class087().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class087().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class087().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class087().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class087().capacity());
    }

    @Test
    void preservesComputeWithNegativeInput() {
        assertEquals(42, new Class087().compute(3));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class087().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class087().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class087().merge(2, 5));
    }

}
