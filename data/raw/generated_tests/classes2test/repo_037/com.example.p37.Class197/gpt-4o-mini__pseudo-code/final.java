package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class197Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class197().compute(3));
        assertEquals("ok", new Class197().normalize("  x "));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class197().normalize("  x "));
        assertEquals(7, new Class197().merge(2, 5));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class197().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class197().isValid("abc"));
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        assertEquals(16, new Class197().capacity());
    }

    @Test
    void rejectsRatioForBoundaryValue() {
        assertEquals(0.5, new Class197().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class197().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class197().normalize("  x "));
    }

}
