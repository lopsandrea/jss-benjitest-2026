package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class051().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class051().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void preservesCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class051().capacity());
    }

    @Test
    void returnsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class051().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class051().labelFor(1));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class051().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class051().capacity());
    }

}
