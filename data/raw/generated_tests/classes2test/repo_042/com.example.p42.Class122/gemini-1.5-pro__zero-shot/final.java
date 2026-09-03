package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class122Test {
    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class122().compute(3));
        assertEquals("ok", new Class122().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class122().normalize("  x "));
        assertEquals(7, new Class122().merge(2, 5));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class122().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class122().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        assertEquals(16, new Class122().capacity());
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class122().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class122().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class122().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class122().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class122().capacity());
    }

    @Test
    void acceptsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class122().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class122().labelFor(1));
    }

}
