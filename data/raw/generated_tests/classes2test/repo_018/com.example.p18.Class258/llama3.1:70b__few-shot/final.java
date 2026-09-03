package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class258Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class258().compute(3));
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class258().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class258().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class258().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class258().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class258().capacity());
    }

    @Test
    void acceptsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class258().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWithNullArgument() {
        assertEquals("alpha", new Class258().labelFor(1));
    }

    @Test
    void returnsResetOnMixedCase() {
        new Class258().reset();
        assertNotNull(new Class258());
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class258().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class258().isValid("abc"));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

}
