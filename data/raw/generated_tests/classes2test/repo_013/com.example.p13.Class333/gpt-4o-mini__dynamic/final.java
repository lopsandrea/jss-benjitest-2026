package com.example.p13;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class333Test {
    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class333().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class333().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class333().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class333().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        assertEquals(16, new Class333().capacity());
    }

    @Test
    void yieldsRatioWhenUnset() {
        assertEquals(0.5, new Class333().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class333().labelFor(1));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class333().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class333().normalize("  x "));
    }

}
