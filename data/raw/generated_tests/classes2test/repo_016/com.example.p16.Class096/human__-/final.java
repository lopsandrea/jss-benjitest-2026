package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class096Test {
    @Test
    void shouldRoundTripComputeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class096().compute(3));
        assertEquals("ok", new Class096().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeWhenUnset() {
        assertEquals("ok", new Class096().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class096().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class096().merge(2, 5));
        assertTrue(new Class096().isValid("abc"));
    }

    @Test
    void shouldReturnIsValidOnEmptyString() {
        assertTrue(new Class096().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class096().compute(3));
    }

    @Test
    void shouldRejectComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class096().compute(3));
    }

    @Test
    void shouldReturnNormalizeOnMixedCase() {
        assertEquals("ok", new Class096().normalize("  x "));
    }

    @Test
    void shouldRejectMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class096().merge(2, 5));
    }

    @Test
    void shouldKeepIsValidAtZero() {
        assertTrue(new Class096().isValid("abc"));
    }

    @Test
    void shouldReturnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class096().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeOnMixedCase() {
        assertEquals("ok", new Class096().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class096().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidAtUpperBound() {
        assertTrue(new Class096().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class096().compute(3));
    }

}
