package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class360Test {
    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class360().compute(3));
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class360().normalize("  x "));
        assertEquals(7, new Class360().merge(2, 5));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        assertEquals(7, new Class360().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class360().isValid("abc"));
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class360().capacity());
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class360().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class360().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class360().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class360().isValid("abc"));
    }

}
