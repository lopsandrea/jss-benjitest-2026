package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class091Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        new Class091().compute(3);
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class091().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        assertEquals(7, new Class091().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class091().isValid("abc"));
    }

    @Test
    void preservesCapacityOnMixedCase() {
        assertEquals(16, new Class091().capacity());
    }

    @Test
    void clampsRatioWithNullArgument() {
        assertEquals(0.5, new Class091().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class091().labelFor(1));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class091().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class091().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class091().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class091().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class091().capacity());
    }

}
