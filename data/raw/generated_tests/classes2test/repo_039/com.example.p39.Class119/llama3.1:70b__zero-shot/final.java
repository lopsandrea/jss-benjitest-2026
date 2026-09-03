package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class119Test {
    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class119().compute(3));
        assertEquals("ok", new Class119().normalize("  x "));
    }

    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class119().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class119().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class119().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class119().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class119().capacity());
    }

}
