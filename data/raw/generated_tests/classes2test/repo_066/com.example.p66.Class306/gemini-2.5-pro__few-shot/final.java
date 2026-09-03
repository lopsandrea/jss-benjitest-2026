package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class306Test {
    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class306().compute(3));
        assertEquals("ok", new Class306().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class306().normalize("  x "));
        assertEquals(7, new Class306().merge(2, 5));
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class306().merge(2, 5));
        assertTrue(new Class306().isValid("abc"));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class306().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class306().capacity());
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class306().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class306().compute(3));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class306().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class306().normalize("  x "));
    }

}
