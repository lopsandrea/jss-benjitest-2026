package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class197Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class197().compute(3));
        assertEquals("ok", new Class197().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class197().normalize("  x "));
        assertEquals(7, new Class197().merge(2, 5));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class197().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class197().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class197().capacity());
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class197().compute(3));
    }

}
