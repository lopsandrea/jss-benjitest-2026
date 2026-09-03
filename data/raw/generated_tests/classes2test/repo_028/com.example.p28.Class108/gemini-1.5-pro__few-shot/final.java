package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class108().compute(3));
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class108().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class108().merge(2, 5));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class108().merge(2, 5));
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class108().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class108().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class108().labelFor(1));
    }

    @Test
    void reportsResetAtZero() {
        new Class108().reset();
        assertNotNull(new Class108());
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

}
