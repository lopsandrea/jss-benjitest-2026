package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class189Test {
    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class189().compute(3));
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class189().normalize("  x "));
        assertEquals(7, new Class189().merge(2, 5));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class189().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class189().isValid("abc"));
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class189().capacity());
    }

    @Test
    void yieldsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class189().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForAtZero() {
        assertEquals("alpha", new Class189().labelFor(1));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class189().normalize("  x "));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class189().compute(3));
    }

}
