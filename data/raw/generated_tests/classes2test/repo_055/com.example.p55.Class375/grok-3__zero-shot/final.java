package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class375Test {
    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class375().compute(3));
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class375().normalize("  x "));
        assertEquals(7, new Class375().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class375().merge(2, 5));
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class375().isValid("abc"));
        assertEquals(16, new Class375().capacity());
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        assertEquals(16, new Class375().capacity());
        assertEquals(0.5, new Class375().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioWhenUnset() {
        assertEquals(0.5, new Class375().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class375().labelFor(1));
    }

    @Test
    void yieldsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class375().labelFor(1));
        new Class375().reset();
        assertNotNull(new Class375());
    }

    @Test
    void preservesResetOnEmptyString() {
        new Class375().reset();
        assertNotNull(new Class375());
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class375().compute(3));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class375().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class375().merge(2, 5));
    }

    @Test
    void clampsIsValidForBoundaryValue() {
        assertTrue(new Class375().isValid("abc"));
    }

}
