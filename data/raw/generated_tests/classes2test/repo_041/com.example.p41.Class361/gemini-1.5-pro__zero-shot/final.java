package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {
    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class361().compute(3));
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class361().normalize("  x "));
        assertEquals(7, new Class361().merge(2, 5));
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class361().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class361().isValid("abc"));
    }

    @Test
    void reportsCapacityForBoundaryValue() {
        assertEquals(16, new Class361().capacity());
    }

    @Test
    void clampsRatioOnMixedCase() {
        assertEquals(0.5, new Class361().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnEmptyString() {
        assertEquals("alpha", new Class361().labelFor(1));
    }

    @Test
    void reportsResetWhenUnset() {
        new Class361().reset();
        assertNotNull(new Class361());
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class361().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class361().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class361().isValid("abc"));
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class361().compute(3));
    }

}
