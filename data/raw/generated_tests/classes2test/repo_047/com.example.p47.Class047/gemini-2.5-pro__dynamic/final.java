package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class047Test {
    @Test
    void reportsComputeAtUpperBound() {
        new Class047().compute(3);
    }

    @Test
    void acceptsNormalizeAtZero() {
        new Class047().normalize("  x ");
    }

    @Test
    void keepsMergeForBoundaryValue() {
        assertEquals(7, new Class047().merge(2, 5));
        assertTrue(new Class047().isValid("abc"));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class047().isValid("abc"));
        assertEquals(16, new Class047().capacity());
    }

    @Test
    void keepsCapacityOnEmptyString() {
        assertEquals(16, new Class047().capacity());
    }

    @Test
    void clampsRatioWithNegativeInput() {
        assertEquals(0.5, new Class047().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForForBoundaryValue() {
        assertEquals("alpha", new Class047().labelFor(1));
    }

    @Test
    void yieldsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class047().compute(3));
    }

}
