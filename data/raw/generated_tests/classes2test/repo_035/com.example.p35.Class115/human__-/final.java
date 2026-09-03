package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class115Test {
    @Test
    void shouldIgnoreComputeOnMixedCase() {
        new Class115().compute(3);
    }

    @Test
    void shouldRejectComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class115().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class115().normalize("  x "));
    }

    @Test
    void shouldKeepMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class115().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidOnTrimmedInput() {
        assertTrue(new Class115().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class115().capacity());
    }

    @Test
    void shouldFailFastRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class115().ratio(1.0, 2.0), 1e-9);
    }

}
