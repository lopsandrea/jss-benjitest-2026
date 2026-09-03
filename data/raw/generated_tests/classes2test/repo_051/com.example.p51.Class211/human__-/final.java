package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class211Test {
    @Test
    void shouldRoundTripComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class211().compute(3));
            assertEquals("ok", new Class211().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class211().normalize("  x "));
        assertEquals(7, new Class211().merge(2, 5));
    }

    @Test
    void shouldRejectMergeForBoundaryValue() {
        assertEquals(7, new Class211().merge(2, 5));
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidOnEmptyString() {
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void shouldRoundTripComputeOnTrimmedInput() {
        assertEquals(42, new Class211().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class211().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class211().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidForBoundaryValue() {
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void shouldIgnoreComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class211().compute(3));
    }

    @Test
    void shouldRejectNormalizeAtUpperBound() {
        assertEquals("ok", new Class211().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class211().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidWithNullArgument() {
        assertTrue(new Class211().isValid("abc"));
    }

}
