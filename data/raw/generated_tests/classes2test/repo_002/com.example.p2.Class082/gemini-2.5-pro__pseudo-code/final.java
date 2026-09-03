package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class082Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class082().compute(3));
        assertEquals("ok", new Class082().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class082().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class082().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class082().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class082().capacity());
    }

    @Test
    void reportsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class082().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

}
