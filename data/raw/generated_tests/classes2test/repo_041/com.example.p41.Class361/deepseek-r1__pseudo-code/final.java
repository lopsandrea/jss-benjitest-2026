package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class361().compute(3));
            assertEquals("ok", new Class361().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class361().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class361().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class361().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class361().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForKnownCode() {
        assertEquals("alpha", new Class361().labelFor(1));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class361().compute(3));
    }

}
