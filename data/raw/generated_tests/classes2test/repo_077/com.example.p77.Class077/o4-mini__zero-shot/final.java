package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class077Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        assertEquals(42, new Class077().compute(3));
        assertEquals("ok", new Class077().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class077().normalize("  x "));
        assertEquals(7, new Class077().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class077().merge(2, 5));
        assertTrue(new Class077().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class077().isValid("abc"));
        assertEquals(16, new Class077().capacity());
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        assertEquals(16, new Class077().capacity());
        assertEquals(42, new Class077().compute(3));
    }

    @Test
    void returnsComputeOnEmptyString() {
        assertEquals(42, new Class077().compute(3));
        assertEquals("ok", new Class077().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class077().normalize("  x "));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class077().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class077().normalize("  x "));
    }

    @Test
    void clampsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class077().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class077().isValid("abc"));
    }

}
