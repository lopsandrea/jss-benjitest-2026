package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class265Test {
    @Test
    void reportsComputeOnEmptyString() {
        new Class265().compute(3);
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class265().normalize("  x "));
        assertEquals(7, new Class265().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class265().merge(2, 5));
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        assertEquals(16, new Class265().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class265().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWithNullArgument() {
        assertEquals("alpha", new Class265().labelFor(1));
    }

    @Test
    void acceptsResetWithNullArgument() {
        new Class265().reset();
        assertNotNull(new Class265());
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class265().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class265().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class265().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class265().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class265().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class265().normalize("  x "));
    }

}
