package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class129Test {
    @Test
    void clampsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class129().compute(3));
            assertEquals("ok", new Class129().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class129().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class129().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class129().merge(2, 5));
        assertTrue(new Class129().isValid("abc"));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class129().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class129().capacity());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class129().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class129().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class129().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class129().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class129().capacity());
    }

    @Test
    void yieldsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class129().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class129().labelFor(1));
    }

}
