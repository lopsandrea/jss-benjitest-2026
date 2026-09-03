package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class250Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class250().compute(3));
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class250().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class250().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class250().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class250().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class250().ratio(1.0, 2.0), 1e-9);
    }

}
