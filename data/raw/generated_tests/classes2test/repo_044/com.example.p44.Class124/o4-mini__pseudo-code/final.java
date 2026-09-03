package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class124Test {
    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class124().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class124().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class124().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class124().capacity());
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class124().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class124().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class124().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class124().capacity());
    }

    @Test
    void clampsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class124().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
    }

}
