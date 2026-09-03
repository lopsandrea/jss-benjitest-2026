package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {
    @Test
    void returnsComputeWithNegativeInput() {
        new Class095().compute(3);
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        new Class095().normalize("  x ");
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class095().merge(2, 5));
        assertTrue(new Class095().isValid("abc"));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class095().isValid("abc"));
        assertEquals(16, new Class095().capacity());
    }

    @Test
    void yieldsCapacityAtZero() {
        assertEquals(16, new Class095().capacity());
        assertEquals(0.5, new Class095().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsRatioWithNullArgument() {
        assertEquals(0.5, new Class095().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class095().labelFor(1));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class095().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class095().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class095().merge(2, 5));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class095().isValid("abc"));
    }

    @Test
    void reportsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class095().capacity());
    }

    @Test
    void clampsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class095().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class095().labelFor(1));
    }

    @Test
    void rejectsResetOnMixedCase() {
        new Class095().reset();
        assertNotNull(new Class095());
    }

}
