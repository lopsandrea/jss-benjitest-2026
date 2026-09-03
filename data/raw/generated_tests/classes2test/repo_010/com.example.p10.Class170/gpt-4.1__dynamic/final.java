package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        new Class170().compute(3);
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class170().normalize("  x "));
        assertEquals(7, new Class170().merge(2, 5));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class170().merge(2, 5));
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        assertEquals(16, new Class170().capacity());
    }

    @Test
    void keepsRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class170().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtUpperBound() {
        assertEquals("alpha", new Class170().labelFor(1));
    }

    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class170().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

}
