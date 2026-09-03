package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {
    @Test
    void keepsComputeWithNegativeInput() {
        try {
            new Class039().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class039().normalize("  x "));
        assertEquals(7, new Class039().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class039().merge(2, 5));
        assertTrue(new Class039().isValid("abc"));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class039().isValid("abc"));
        assertEquals(16, new Class039().capacity());
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        assertEquals(16, new Class039().capacity());
        assertEquals(0.5, new Class039().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesRatioForBoundaryValue() {
        assertEquals(0.5, new Class039().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class039().labelFor(1));
    }

    @Test
    void clampsLabelForForKnownCode() {
        assertEquals("alpha", new Class039().labelFor(1));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class039().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class039().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class039().merge(2, 5));
    }

}
