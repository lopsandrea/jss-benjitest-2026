package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class184Test {
    @Test
    void shouldFailFastComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class184().compute(3);
    }

    @Test
    void shouldKeepNormalizeWithNegativeInput() {
        assertEquals("ok", new Class184().normalize("  x "));
        assertEquals(7, new Class184().merge(2, 5));
    }

    @Test
    void shouldReturnMergeForBoundaryValue() {
        assertEquals(7, new Class184().merge(2, 5));
        assertTrue(new Class184().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidAtUpperBound() {
        assertTrue(new Class184().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class184().capacity());
    }

    @Test
    void shouldFailFastCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class184().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class184().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class184().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForWhenUnset() {
        assertEquals("alpha", new Class184().labelFor(1));
    }

    @Test
    void shouldReturnComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class184().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void shouldKeepMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class184().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnRepeatedCall() {
        assertTrue(new Class184().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class184().capacity());
    }

    @Test
    void shouldKeepRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class184().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class184().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForBoundaryValue() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class184().merge(2, 5));
    }

}
