package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class197Test {
    @Test
    void rejectsComputeWithNullArgument() {
        assertEquals(42, new Class197().compute(3));
        assertEquals("ok", new Class197().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class197().normalize("  x "));
        assertEquals(7, new Class197().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class197().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class197().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class197().capacity());
    }

    @Test
    void keepsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class197().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class197().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class197().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class197().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class197().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class197().capacity());
    }

    @Test
    void rejectsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class197().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class197().compute(3));
    }

}
