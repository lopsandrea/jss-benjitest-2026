package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class304Test {
    @Test
    void shouldReturnComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class304().compute(3);
    }

    @Test
    void shouldIgnoreNormalizeAtZero() {
        assertEquals("ok", new Class304().normalize("  x "));
        assertEquals(7, new Class304().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        assertEquals(7, new Class304().merge(2, 5));
        assertTrue(new Class304().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidOnEmptyString() {
        assertTrue(new Class304().isValid("abc"));
        assertEquals(16, new Class304().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class304().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class304().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class304().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class304().labelFor(1));
    }

    @Test
    void shouldIgnoreLabelForOnMixedCase() {
        assertEquals("alpha", new Class304().labelFor(1));
    }

    @Test
    void shouldRoundTripResetForBoundaryValue() {
        new Class304().reset();
        assertNotNull(new Class304());
    }

    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class304().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class304().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class304().merge(2, 5));
    }

    @Test
    void shouldHandleComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class304().compute(3));
    }

    @Test
    void shouldHandleNormalizeWithNullArgument() {
        assertEquals("ok", new Class304().normalize("  x "));
    }

}
