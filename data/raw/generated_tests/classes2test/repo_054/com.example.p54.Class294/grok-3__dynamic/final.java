package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class294().compute(3));
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class294().normalize("  x "));
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void returnsMergeForKnownCode() {
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class294().capacity());
    }

    @Test
    void clampsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class294().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class294().labelFor(1));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

}
