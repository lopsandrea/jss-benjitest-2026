package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class174Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        new Class174().compute(3);
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class174().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class174().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class174().isValid("abc"));
    }

}
