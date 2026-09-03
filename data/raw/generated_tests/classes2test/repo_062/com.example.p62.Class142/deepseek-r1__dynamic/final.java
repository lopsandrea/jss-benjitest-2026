package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class142Test {
    @Test
    void returnsComputeOnRepeatedCall() {
        assertEquals(42, new Class142().compute(3));
        assertEquals("ok", new Class142().normalize("  x "));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class142().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        assertEquals(7, new Class142().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class142().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        assertEquals(16, new Class142().capacity());
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        assertEquals(0.5, new Class142().ratio(1.0, 2.0), 1e-9);
    }

}
