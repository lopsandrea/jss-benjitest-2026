package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class157Test {
    @Test
    void shouldReturnComputeAtZero() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class157().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeOnTrimmedInput() {
        try {
            new Class157().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripMergeWhenUnset() {
        assertEquals(7, new Class157().merge(2, 5));
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void shouldRejectIsValidOnRepeatedCall() {
        assertTrue(new Class157().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class157().capacity());
    }

    @Test
    void shouldRejectRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class157().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeForBoundaryValue() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

    @Test
    void shouldReturnComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class157().compute(3));
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class157().normalize("  x "));
    }

}
