package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class029Test {
    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class029().compute(3));
        assertEquals("ok", new Class029().normalize("  x "));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class029().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        assertEquals(7, new Class029().merge(2, 5));
    }

    @Test
    void keepsIsValidWithNegativeInput() {
        assertTrue(new Class029().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class029().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class029().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForKnownCode() {
        assertEquals("alpha", new Class029().labelFor(1));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class029().compute(3));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class029().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class029().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class029().isValid("abc"));
    }

}
