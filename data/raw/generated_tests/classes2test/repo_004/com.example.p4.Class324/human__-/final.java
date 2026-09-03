package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class324Test {
    @Test
    void shouldKeepComputeAtZero() {
        new Class324().compute(3);
    }

    @Test
    void shouldHandleNormalizeForKnownCode() {
        assertEquals("ok", new Class324().normalize("  x "));
        assertEquals(7, new Class324().merge(2, 5));
    }

    @Test
    void shouldKeepMergeForKnownCode() {
        assertEquals(7, new Class324().merge(2, 5));
        assertTrue(new Class324().isValid("abc"));
    }

    @Test
    void shouldHandleIsValidAtUpperBound() {
        assertTrue(new Class324().isValid("abc"));
        assertEquals(16, new Class324().capacity());
    }

    @Test
    void shouldRoundTripCapacityWhenUnset() {
        assertEquals(16, new Class324().capacity());
    }

    @Test
    void shouldHandleRatioOnTrimmedInput() {
        assertEquals(0.5, new Class324().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForWithNullArgument() {
        assertEquals("alpha", new Class324().labelFor(1));
    }

    @Test
    void shouldReturnResetAtZero() {
        new Class324().reset();
        assertNotNull(new Class324());
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class324().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class324().compute(3));
    }

    @Test
    void shouldRejectNormalizeForBoundaryValue() {
        assertEquals("ok", new Class324().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class324().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidOnTrimmedInput() {
        assertTrue(new Class324().isValid("abc"));
    }

}
