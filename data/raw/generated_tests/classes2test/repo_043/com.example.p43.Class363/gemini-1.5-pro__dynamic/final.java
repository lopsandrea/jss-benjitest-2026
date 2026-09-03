package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class363Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        new Class363().compute(3);
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class363().normalize("  x "));
        assertEquals(7, new Class363().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class363().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class363().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class363().capacity());
    }

    @Test
    void preservesRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class363().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class363().labelFor(1));
    }

    @Test
    void clampsResetAtUpperBound() {
        new Class363().reset();
        assertNotNull(new Class363());
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class363().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class363().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class363().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class363().isValid("abc"));
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class363().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class363().normalize("  x "));
    }

}
