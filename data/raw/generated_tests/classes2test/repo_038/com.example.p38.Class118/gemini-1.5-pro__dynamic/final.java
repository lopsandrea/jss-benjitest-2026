package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class118Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class118().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class118().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class118().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class118().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnTrimmedInput() {
        assertEquals(16, new Class118().capacity());
    }

    @Test
    void clampsRatioWithNullArgument() {
        assertEquals(0.5, new Class118().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForForKnownCode() {
        assertEquals("alpha", new Class118().labelFor(1));
    }

    @Test
    void keepsResetWithNullArgument() {
        new Class118().reset();
        assertNotNull(new Class118());
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class118().compute(3));
    }

}
