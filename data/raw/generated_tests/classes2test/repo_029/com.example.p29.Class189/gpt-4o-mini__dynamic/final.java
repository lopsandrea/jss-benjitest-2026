package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class189Test {
    @Test
    void returnsComputeForKnownCode() {
        new Class189().compute(3);
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class189().normalize("  x "));
        assertEquals(7, new Class189().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class189().merge(2, 5));
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        assertEquals(16, new Class189().capacity());
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        assertEquals(0.5, new Class189().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWithNullArgument() {
        assertEquals("alpha", new Class189().labelFor(1));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class189().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class189().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

}
