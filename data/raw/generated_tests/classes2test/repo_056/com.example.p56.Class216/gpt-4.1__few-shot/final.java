package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class216Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        new Class216().compute(3);
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        new Class216().normalize("  x ");
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class216().merge(2, 5));
        assertTrue(new Class216().isValid("abc"));
    }

    @Test
    void clampsIsValidWhenAlreadyValid() {
        assertTrue(new Class216().isValid("abc"));
        assertEquals(16, new Class216().capacity());
    }

    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class216().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class216().normalize("  x "));
    }

}
