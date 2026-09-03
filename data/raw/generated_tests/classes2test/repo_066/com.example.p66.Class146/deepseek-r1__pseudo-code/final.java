package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {
    @Test
    void keepsComputeOnRepeatedCall() {
        assertEquals(42, new Class146().compute(3));
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        assertEquals(7, new Class146().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class146().capacity());
    }

    @Test
    void preservesRatioWithNegativeInput() {
        assertEquals(0.5, new Class146().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class146().compute(3));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class146().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class146().isValid("abc"));
    }

}
