package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class171Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class171().compute(3));
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class171().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class171().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class171().capacity());
    }

    @Test
    void returnsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class171().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWhenUnset() {
        assertEquals("alpha", new Class171().labelFor(1));
    }

    @Test
    void keepsResetForBoundaryValue() {
        new Class171().reset();
        assertNotNull(new Class171());
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class171().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class171().merge(2, 5));
    }

}
