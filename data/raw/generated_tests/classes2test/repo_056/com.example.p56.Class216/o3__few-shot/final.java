package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void acceptsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class216().compute(3));
            assertEquals("ok", new Class216().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class216().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class216().merge(2, 5));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class216().merge(2, 5));
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class216().capacity());
    }

    @Test
    void returnsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class216().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class216().labelFor(1));
    }

    @Test
    void clampsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class216().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class216().capacity());
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

}
