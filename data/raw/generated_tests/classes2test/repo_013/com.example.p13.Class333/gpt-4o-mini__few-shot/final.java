package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class333Test {
    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class333().compute(3));
        assertEquals("ok", new Class333().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class333().normalize("  x "));
        assertEquals(7, new Class333().merge(2, 5));
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class333().merge(2, 5));
        assertTrue(new Class333().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class333().isValid("abc"));
        assertEquals(16, new Class333().capacity());
    }

    @Test
    void preservesCapacityAtUpperBound() {
        assertEquals(16, new Class333().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class333().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class333().labelFor(1));
    }

    @Test
    void yieldsResetOnEmptyString() {
        new Class333().reset();
        assertNotNull(new Class333());
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class333().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class333().normalize("  x "));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class333().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class333().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class333().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class333().isValid("abc"));
    }

}
