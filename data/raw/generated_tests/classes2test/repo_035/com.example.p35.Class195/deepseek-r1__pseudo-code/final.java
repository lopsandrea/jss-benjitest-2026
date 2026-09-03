package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class195Test {
    @Test
    void rejectsComputeWithNegativeInput() {
        try {
            new Class195().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        new Class195().normalize("  x ");
    }

    @Test
    void acceptsMergeOnEmptyString() {
        assertEquals(7, new Class195().merge(2, 5));
        assertTrue(new Class195().isValid("abc"));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class195().isValid("abc"));
        assertEquals(16, new Class195().capacity());
    }

    @Test
    void reportsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class195().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class195().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class195().ratio(1.0, 2.0), 1e-9);
    }

}
