package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class123Test {
    @Test
    void preservesComputeOnMixedCase() {
        new Class123().compute(3);
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class123().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        assertEquals(7, new Class123().merge(2, 5));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class123().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        assertEquals(16, new Class123().capacity());
    }

    @Test
    void acceptsRatioOnEmptyString() {
        assertEquals(0.5, new Class123().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWhenUnset() {
        assertEquals("alpha", new Class123().labelFor(1));
    }

    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class123().compute(3));
    }

    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class123().compute(3));
    }

}
