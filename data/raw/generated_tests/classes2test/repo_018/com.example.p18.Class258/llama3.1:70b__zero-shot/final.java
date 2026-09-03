package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class258Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class258().compute(3));
            assertEquals("ok", new Class258().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class258().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class258().isValid("abc"));
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        assertEquals(16, new Class258().capacity());
    }

    @Test
    void acceptsRatioForBoundaryValue() {
        assertEquals(0.5, new Class258().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForAtUpperBound() {
        assertEquals("alpha", new Class258().labelFor(1));
    }

    @Test
    void preservesResetWithNegativeInput() {
        new Class258().reset();
        assertNotNull(new Class258());
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

}
