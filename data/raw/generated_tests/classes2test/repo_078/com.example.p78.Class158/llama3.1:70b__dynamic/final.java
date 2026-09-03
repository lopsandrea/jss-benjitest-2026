package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class158Test {
    @Test
    void preservesComputeWhenUnset() {
        assertEquals(42, new Class158().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class158().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        assertEquals(7, new Class158().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class158().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class158().capacity());
    }

    @Test
    void reportsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class158().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class158().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class158().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class158().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class158().isValid("abc"));
    }

}
