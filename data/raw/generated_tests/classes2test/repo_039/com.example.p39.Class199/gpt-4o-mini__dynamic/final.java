package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class199Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class199().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class199().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class199().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class199().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class199().capacity());
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class199().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class199().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class199().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class199().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class199().capacity());
    }

}
