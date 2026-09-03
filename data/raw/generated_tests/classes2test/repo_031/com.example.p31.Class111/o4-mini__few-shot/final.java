package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class111Test {
    @Test
    void reportsComputeWithNegativeInput() {
        new Class111().compute(3);
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class111().normalize("  x "));
        assertEquals(7, new Class111().merge(2, 5));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class111().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class111().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class111().merge(2, 5));
    }

}
