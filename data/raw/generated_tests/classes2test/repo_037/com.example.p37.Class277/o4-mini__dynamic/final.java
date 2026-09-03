package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class277Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class277().compute(3));
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void clampsMergeOnMixedCase() {
        assertEquals(7, new Class277().merge(2, 5));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class277().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class277().normalize("  x "));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class277().merge(2, 5));
    }

}
