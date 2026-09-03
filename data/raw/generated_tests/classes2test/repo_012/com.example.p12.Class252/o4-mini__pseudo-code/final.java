package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class252Test {
    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class252().compute(3));
        assertEquals("ok", new Class252().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class252().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class252().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class252().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class252().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class252().capacity());
    }

    @Test
    void keepsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class252().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class252().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class252().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class252().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class252().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class252().capacity());
    }

    @Test
    void yieldsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class252().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class252().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class252().normalize("  x "));
    }

}
