package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class251Test {
    @Test
    void acceptsComputeAtUpperBound() {
        assertEquals(42, new Class251().compute(3));
        assertEquals("ok", new Class251().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class251().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class251().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class251().isValid("abc"));
    }

}
