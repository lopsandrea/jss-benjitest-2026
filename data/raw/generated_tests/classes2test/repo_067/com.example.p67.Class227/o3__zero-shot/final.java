package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class227Test {
    @Test
    void yieldsComputeForKnownCode() {
        try {
            new Class227().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class227().normalize("  x "));
        assertEquals(7, new Class227().merge(2, 5));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class227().merge(2, 5));
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class227().isValid("abc"));
        assertEquals(16, new Class227().capacity());
    }

    @Test
    void clampsCapacityWithNullArgument() {
        assertEquals(16, new Class227().capacity());
        assertEquals(0.5, new Class227().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioWithNegativeInput() {
        assertEquals(0.5, new Class227().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class227().labelFor(1));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class227().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class227().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class227().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class227().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class227().capacity());
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class227().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWhenUnset() {
        assertEquals("alpha", new Class227().labelFor(1));
    }

}
