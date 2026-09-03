package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class189Test {
    @Test
    void returnsComputeForBoundaryValue() {
        new Class189().compute(3);
    }

    @Test
    void reportsNormalizeForKnownCode() {
        new Class189().normalize("  x ");
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class189().merge(2, 5));
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class189().isValid("abc"));
        assertEquals(16, new Class189().capacity());
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        assertEquals(16, new Class189().capacity());
        assertEquals(0.5, new Class189().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class189().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class189().labelFor(1));
    }

    @Test
    void returnsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class189().labelFor(1));
        int expected1 = 42;
        assertEquals(expected1, new Class189().compute(3));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class189().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnTrimmedInput() {
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class189().merge(2, 5));
    }

}
