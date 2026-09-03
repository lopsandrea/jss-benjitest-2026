package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class095().compute(3));
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        assertEquals(7, new Class095().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class095().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        assertEquals(16, new Class095().capacity());
    }

    @Test
    void returnsRatioAtZero() {
        assertEquals(0.5, new Class095().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class095().labelFor(1));
    }

    @Test
    void yieldsResetWithNegativeInput() {
        new Class095().reset();
        assertNotNull(new Class095());
    }

    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class095().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class095().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class095().isValid("abc"));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class095().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

}
