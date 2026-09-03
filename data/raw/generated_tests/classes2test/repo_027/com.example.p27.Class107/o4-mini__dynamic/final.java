package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class107Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        new Class107().compute(3);
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        new Class107().normalize("  x ");
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class107().merge(2, 5));
        assertTrue(new Class107().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class107().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class107().capacity());
    }

    @Test
    void keepsRatioAtZero() {
        assertEquals(0.5, new Class107().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class107().labelFor(1));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class107().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class107().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class107().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class107().isValid("abc"));
    }

    @Test
    void keepsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class107().capacity());
    }

}
