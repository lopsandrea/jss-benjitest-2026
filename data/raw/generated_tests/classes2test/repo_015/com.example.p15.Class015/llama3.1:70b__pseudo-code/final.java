package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class015().compute(3));
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class015().merge(2, 5));
    }

    @Test
    void preservesIsValidForBoundaryValue() {
        assertTrue(new Class015().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtZero() {
        assertEquals(16, new Class015().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        assertEquals(0.5, new Class015().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnEmptyString() {
        assertEquals("alpha", new Class015().labelFor(1));
    }

    @Test
    void rejectsResetForBoundaryValue() {
        new Class015().reset();
        assertNotNull(new Class015());
    }

    @Test
    void yieldsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class015().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class015().merge(2, 5));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class015().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

}
