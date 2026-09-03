package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class323Test {
    @Test
    void clampsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class323().compute(3));
            assertEquals("ok", new Class323().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class323().normalize("  x "));
        assertEquals(7, new Class323().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class323().merge(2, 5));
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class323().isValid("abc"));
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class323().compute(3));
    }

}
