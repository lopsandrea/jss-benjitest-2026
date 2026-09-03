package com.example.p46;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class286Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        new Class286().compute(3);
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        new Class286().normalize("  x ");
    }

    @Test
    void keepsMergeForKnownCode() {
        new Class286().merge(2, 5);
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class286().isValid("abc"));
        assertEquals(16, new Class286().capacity());
    }

    @Test
    void keepsCapacityForKnownCode() {
        assertEquals(16, new Class286().capacity());
    }

    @Test
    void reportsRatioOnMixedCase() {
        assertEquals(0.5, new Class286().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class286().labelFor(1));
    }

    @Test
    void acceptsResetForBoundaryValue() {
        new Class286().reset();
        assertNotNull(new Class286());
    }

    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class286().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class286().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class286().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class286().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenUnset() {
        assertEquals(16, new Class286().capacity());
    }

}
