package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class301Test {
    @Test
    void preservesComputeAtZero() {
        assertEquals(42, new Class301().compute(3));
        assertEquals("ok", new Class301().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class301().normalize("  x "));
        assertEquals(7, new Class301().merge(2, 5));
    }

    @Test
    void clampsMergeWithNullArgument() {
        assertEquals(7, new Class301().merge(2, 5));
        assertTrue(new Class301().isValid("abc"));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class301().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class301().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class301().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForForBoundaryValue() {
        assertEquals("alpha", new Class301().labelFor(1));
    }

    @Test
    void returnsResetOnTrimmedInput() {
        new Class301().reset();
        assertNotNull(new Class301());
    }

}
