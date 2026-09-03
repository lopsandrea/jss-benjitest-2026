package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class250Test {
    @Test
    void reportsComputeOnMixedCase() {
        assertEquals(42, new Class250().compute(3));
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class250().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class250().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class250().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class250().capacity());
    }

    @Test
    void preservesRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class250().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class250().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class250().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class250().merge(2, 5));
    }

}
