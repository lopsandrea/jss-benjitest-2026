package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class029Test {
    @Test
    void preservesComputeWithNullArgument() {
        new Class029().compute(3);
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class029().normalize("  x "));
        assertEquals(7, new Class029().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class029().merge(2, 5));
        assertTrue(new Class029().isValid("abc"));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class029().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class029().capacity());
    }

    @Test
    void reportsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class029().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForAtUpperBound() {
        assertEquals("alpha", new Class029().labelFor(1));
    }

    @Test
    void returnsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class029().compute(3));
    }

}
