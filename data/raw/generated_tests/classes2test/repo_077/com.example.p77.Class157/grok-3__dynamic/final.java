package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void preservesComputeForBoundaryValue() {
        new Class157().compute(3);
    }

    @Test
    void keepsNormalizeForKnownCode() {
        new Class157().normalize("  x ");
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class157().merge(2, 5));
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void clampsComputeForKnownCode() {
        assertEquals(42, new Class157().compute(3));
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

}
