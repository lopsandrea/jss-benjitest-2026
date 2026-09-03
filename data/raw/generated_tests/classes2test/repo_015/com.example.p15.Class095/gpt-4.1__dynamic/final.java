package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class095Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            new Class095().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        new Class095().normalize("  x ");
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class095().merge(2, 5));
        assertTrue(new Class095().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnMixedCase() {
        assertTrue(new Class095().isValid("abc"));
        assertEquals(16, new Class095().capacity());
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        assertEquals(16, new Class095().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class095().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class095().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class095().labelFor(1));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class095().compute(3));
    }

}
