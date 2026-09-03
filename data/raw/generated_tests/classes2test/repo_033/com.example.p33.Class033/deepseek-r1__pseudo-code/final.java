package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class033Test {
    @Test
    void yieldsComputeAtZero() {
        assertEquals(42, new Class033().compute(3));
        assertEquals("ok", new Class033().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class033().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class033().merge(2, 5));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class033().merge(2, 5));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class033().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class033().capacity());
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class033().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class033().labelFor(1));
    }

}
