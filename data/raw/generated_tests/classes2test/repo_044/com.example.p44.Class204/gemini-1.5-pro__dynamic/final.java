package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class204Test {
    @Test
    void preservesComputeForKnownCode() {
        new Class204().compute(3);
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        new Class204().normalize("  x ");
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class204().merge(2, 5));
        assertTrue(new Class204().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class204().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class204().compute(3));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class204().compute(3));
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void keepsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class204().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class204().merge(2, 5));
    }

}
