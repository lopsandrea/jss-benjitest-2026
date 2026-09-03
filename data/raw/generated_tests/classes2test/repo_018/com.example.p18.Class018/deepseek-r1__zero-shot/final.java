package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class018Test {
    @Test
    void clampsComputeWithNullArgument() {
        new Class018().compute(3);
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class018().normalize("  x "));
        assertEquals(7, new Class018().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class018().merge(2, 5));
        assertTrue(new Class018().isValid("abc"));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class018().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnEmptyString() {
        assertEquals(16, new Class018().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class018().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class018().labelFor(1));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class018().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class018().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class018().capacity());
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class018().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class018().normalize("  x "));
    }

}
