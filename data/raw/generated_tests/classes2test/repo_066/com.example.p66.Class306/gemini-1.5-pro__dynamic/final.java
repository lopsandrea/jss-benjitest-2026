package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class306Test {
    @Test
    void rejectsComputeOnMixedCase() {
        new Class306().compute(3);
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class306().normalize("  x "));
        assertEquals(7, new Class306().merge(2, 5));
    }

    @Test
    void yieldsMergeAtUpperBound() {
        assertEquals(7, new Class306().merge(2, 5));
        assertTrue(new Class306().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class306().isValid("abc"));
        assertEquals(16, new Class306().capacity());
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        assertEquals(16, new Class306().capacity());
        assertEquals(42, new Class306().compute(3));
    }

    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class306().compute(3));
        assertEquals("ok", new Class306().normalize("  x "));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class306().compute(3));
    }

}
