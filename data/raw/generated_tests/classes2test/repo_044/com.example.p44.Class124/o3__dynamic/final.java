package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class124Test {
    @Test
    void acceptsComputeOnMixedCase() {
        new Class124().compute(3);
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class124().normalize("  x "));
        assertEquals(7, new Class124().merge(2, 5));
    }

    @Test
    void yieldsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class124().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void reportsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class124().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class124().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class124().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class124().merge(2, 5));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
    }

}
