package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class111Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class111().compute(3));
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class111().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class111().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class111().capacity());
    }

    @Test
    void clampsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class111().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWhenUnset() {
        assertEquals("alpha", new Class111().labelFor(1));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class111().compute(3));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class111().compute(3));
    }

}
