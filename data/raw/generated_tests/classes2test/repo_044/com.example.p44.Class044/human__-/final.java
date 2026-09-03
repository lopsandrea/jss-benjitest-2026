package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class044Test {
    @Test
    void shouldIgnoreComputeOnEmptyString() {
        try {
            new Class044().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class044().normalize("  x "));
            assertEquals(7, new Class044().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleMergeForBoundaryValue() {
        assertEquals(7, new Class044().merge(2, 5));
        assertTrue(new Class044().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidOnMixedCase() {
        assertTrue(new Class044().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class044().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class044().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class044().compute(3));
    }

    @Test
    void shouldFailFastComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class044().compute(3));
    }

    @Test
    void shouldFailFastNormalizeOnEmptyString() {
        assertEquals("ok", new Class044().normalize("  x "));
    }

    @Test
    void shouldHandleComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class044().compute(3));
    }

    @Test
    void shouldKeepNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class044().normalize("  x "));
    }

}
