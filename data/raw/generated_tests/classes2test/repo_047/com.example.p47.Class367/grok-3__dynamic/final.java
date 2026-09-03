package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class367Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class367().compute(3));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class367().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class367().merge(2, 5));
    }

    @Test
    void returnsIsValidForBoundaryValue() {
        assertTrue(new Class367().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class367().capacity());
    }

    @Test
    void reportsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class367().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class367().labelFor(1));
    }

    @Test
    void acceptsResetAtZero() {
        new Class367().reset();
        assertNotNull(new Class367());
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class367().compute(3));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class367().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class367().normalize("  x "));
    }

    @Test
    void reportsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class367().merge(2, 5));
    }

}
