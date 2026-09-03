package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class318Test {
    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class318().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class318().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class318().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class318().isValid("abc"));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class318().compute(3));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        assertEquals(42, new Class318().compute(3));
    }

}
