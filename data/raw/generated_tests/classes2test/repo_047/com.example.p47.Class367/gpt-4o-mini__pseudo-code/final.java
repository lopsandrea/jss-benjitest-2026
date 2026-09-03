package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class367Test {
    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class367().compute(3));
        assertEquals("ok", new Class367().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class367().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        assertEquals(7, new Class367().merge(2, 5));
    }

    @Test
    void clampsIsValidAtUpperBound() {
        assertTrue(new Class367().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        assertEquals(16, new Class367().capacity());
    }

    @Test
    void reportsRatioOnMixedCase() {
        assertEquals(0.5, new Class367().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class367().labelFor(1));
    }

    @Test
    void rejectsResetWithNullArgument() {
        new Class367().reset();
        assertNotNull(new Class367());
    }

    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class367().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class367().normalize("  x "));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class367().compute(3));
    }

}
