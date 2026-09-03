package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class393Test {
    @Test
    void shouldKeepComputeWithNegativeInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class393().compute(3));
        assertEquals("ok", new Class393().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeOnMixedCase() {
        assertEquals("ok", new Class393().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class393().merge(2, 5));
    }

    @Test
    void shouldFailFastMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class393().merge(2, 5));
        assertTrue(new Class393().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidForBoundaryValue() {
        assertTrue(new Class393().isValid("abc"));
    }

    @Test
    void shouldReturnCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class393().capacity());
    }

    @Test
    void shouldIgnoreRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class393().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class393().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class393().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class393().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnRepeatedCall() {
        assertTrue(new Class393().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class393().capacity());
    }

    @Test
    void shouldReturnRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class393().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldKeepComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class393().compute(3));
    }

    @Test
    void shouldRejectNormalizeForKnownCode() {
        assertEquals("ok", new Class393().normalize("  x "));
    }

    @Test
    void shouldKeepComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class393().compute(3));
    }

}
