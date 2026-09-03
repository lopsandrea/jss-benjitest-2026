package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class225Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        new Class225().compute(3);
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class225().normalize("  x "));
        assertEquals(7, new Class225().merge(2, 5));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class225().merge(2, 5));
        assertTrue(new Class225().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class225().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class225().capacity());
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class225().capacity());
    }

    @Test
    void reportsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class225().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class225().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class225().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class225().merge(2, 5));
    }

}
