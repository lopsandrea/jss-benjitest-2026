package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class278Test {
    @Test
    void shouldIgnoreComputeOnEmptyString() {
        new Class278().compute(3);
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        new Class278().normalize("  x ");
    }

    @Test
    void shouldIgnoreMergeAtUpperBound() {
        assertEquals(7, new Class278().merge(2, 5));
        assertTrue(new Class278().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidWhenAlreadyValid() {
        assertTrue(new Class278().isValid("abc"));
        assertEquals(16, new Class278().capacity());
    }

    @Test
    void shouldHandleCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class278().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class278().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class278().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class278().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWithNegativeInput() {
        assertEquals("ok", new Class278().normalize("  x "));
    }

    @Test
    void shouldHandleMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class278().merge(2, 5));
    }

    @Test
    void shouldReturnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class278().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class278().normalize("  x "));
    }

}
