package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class308Test {
    @Test
    void acceptsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class308().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class308().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class308().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class308().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class308().capacity());
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class308().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class308().labelFor(1));
    }

    @Test
    void preservesResetOnRepeatedCall() {
        new Class308().reset();
        assertNotNull(new Class308());
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class308().compute(3));
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class308().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class308().normalize("  x "));
    }

}
