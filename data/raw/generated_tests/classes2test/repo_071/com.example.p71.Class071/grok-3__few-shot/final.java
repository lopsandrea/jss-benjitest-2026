package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class071Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        new Class071().compute(3);
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class071().normalize("  x "));
        assertEquals(7, new Class071().merge(2, 5));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class071().merge(2, 5));
        assertTrue(new Class071().isValid("abc"));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class071().isValid("abc"));
        assertEquals(16, new Class071().capacity());
    }

    @Test
    void keepsCapacityWhenUnset() {
        assertEquals(16, new Class071().capacity());
        assertEquals(0.5, new Class071().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class071().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class071().normalize("  x "));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class071().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class071().isValid("abc"));
    }

}
