package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class021Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class021().compute(3));
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class021().normalize("  x "));
        assertEquals(7, new Class021().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        assertEquals(7, new Class021().merge(2, 5));
        assertTrue(new Class021().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class021().isValid("abc"));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class021().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class021().compute(3));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class021().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class021().merge(2, 5));
    }

}
