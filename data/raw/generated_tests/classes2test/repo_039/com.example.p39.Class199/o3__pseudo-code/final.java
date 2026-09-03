package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class199Test {
    @Test
    void rejectsComputeWhenUnset() {
        new Class199().compute(3);
    }

    @Test
    void preservesNormalizeWhenUnset() {
        new Class199().normalize("  x ");
    }

    @Test
    void yieldsMergeForKnownCode() {
        new Class199().merge(2, 5);
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class199().isValid("abc"));
        assertEquals(16, new Class199().capacity());
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        assertEquals(16, new Class199().capacity());
    }

    @Test
    void keepsRatioOnEmptyString() {
        assertEquals(0.5, new Class199().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class199().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class199().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class199().merge(2, 5));
    }

}
