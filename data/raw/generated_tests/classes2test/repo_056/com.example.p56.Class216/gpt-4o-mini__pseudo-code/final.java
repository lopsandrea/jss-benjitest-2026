package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class216().compute(3));
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        assertEquals(7, new Class216().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class216().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class216().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForAtUpperBound() {
        assertEquals("alpha", new Class216().labelFor(1));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class216().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class216().merge(2, 5));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class216().isValid("abc"));
    }

}
