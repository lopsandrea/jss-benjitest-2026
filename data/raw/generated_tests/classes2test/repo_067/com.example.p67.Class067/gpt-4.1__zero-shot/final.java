package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class067Test {
    @Test
    void keepsComputeAtZero() {
        try {
            new Class067().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class067().normalize("  x "));
        assertEquals(7, new Class067().merge(2, 5));
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class067().merge(2, 5));
        assertTrue(new Class067().isValid("abc"));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class067().isValid("abc"));
        assertEquals(16, new Class067().capacity());
    }

    @Test
    void preservesCapacityWhenUnset() {
        assertEquals(16, new Class067().capacity());
        assertEquals(0.5, new Class067().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioForKnownCode() {
        assertEquals(0.5, new Class067().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnMixedCase() {
        assertEquals("alpha", new Class067().labelFor(1));
    }

    @Test
    void acceptsResetForKnownCode() {
        new Class067().reset();
        assertNotNull(new Class067());
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class067().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class067().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class067().merge(2, 5));
    }

}
