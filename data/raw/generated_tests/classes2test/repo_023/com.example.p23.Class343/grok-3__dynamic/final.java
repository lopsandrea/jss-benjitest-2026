package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class343Test {
    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class343().compute(3));
        assertEquals("ok", new Class343().normalize("  x "));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class343().normalize("  x "));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class343().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class343().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        assertEquals(16, new Class343().capacity());
    }

    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class343().compute(3));
    }

}
