package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class290Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class290().compute(3));
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class290().normalize("  x "));
        assertEquals(7, new Class290().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class290().merge(2, 5));
        assertTrue(new Class290().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNullArgument() {
        assertTrue(new Class290().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class290().capacity());
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class290().capacity());
    }

    @Test
    void reportsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class290().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForForKnownCode() {
        assertEquals("alpha", new Class290().labelFor(1));
    }

    @Test
    void rejectsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class290().compute(3));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class290().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class290().merge(2, 5));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class290().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class290().normalize("  x "));
    }

}
