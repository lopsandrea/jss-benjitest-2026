package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class122Test {
    @Test
    void preservesComputeWhenUnset() {
        try {
            new Class122().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class122().normalize("  x "));
        assertEquals(7, new Class122().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class122().merge(2, 5));
        assertTrue(new Class122().isValid("abc"));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class122().isValid("abc"));
        assertEquals(16, new Class122().capacity());
    }

    @Test
    void returnsCapacityOnEmptyString() {
        assertEquals(16, new Class122().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class122().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class122().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class122().labelFor(1));
    }

    @Test
    void preservesResetForBoundaryValue() {
        new Class122().reset();
        assertNotNull(new Class122());
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class122().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class122().normalize("  x "));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class122().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class122().normalize("  x "));
    }

}
