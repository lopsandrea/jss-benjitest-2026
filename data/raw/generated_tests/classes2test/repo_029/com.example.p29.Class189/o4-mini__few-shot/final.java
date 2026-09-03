package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class189Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class189().compute(3));
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class189().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void rejectsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class189().capacity());
    }

    @Test
    void preservesRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class189().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class189().labelFor(1));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void clampsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class189().merge(2, 5));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

}
