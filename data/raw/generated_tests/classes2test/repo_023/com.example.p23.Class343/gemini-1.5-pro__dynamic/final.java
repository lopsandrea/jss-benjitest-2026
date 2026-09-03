package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class343Test {
    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class343().compute(3));
        assertEquals("ok", new Class343().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class343().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class343().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class343().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        assertEquals(16, new Class343().capacity());
    }

    @Test
    void acceptsRatioOnEmptyString() {
        assertEquals(0.5, new Class343().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class343().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class343().normalize("  x "));
    }

}
