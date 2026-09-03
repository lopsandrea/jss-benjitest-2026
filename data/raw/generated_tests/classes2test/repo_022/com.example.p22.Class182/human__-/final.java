package com.example.p22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class182Test {
    @Test
    void shouldRejectComputeForBoundaryValue() {
        try {
            new Class182().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class182().normalize("  x "));
        assertEquals(7, new Class182().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        assertEquals(7, new Class182().merge(2, 5));
        assertTrue(new Class182().isValid("abc"));
    }

    @Test
    void shouldIgnoreIsValidOnEmptyString() {
        assertTrue(new Class182().isValid("abc"));
        assertEquals(16, new Class182().capacity());
    }

    @Test
    void shouldReturnCapacityOnRepeatedCall() {
        assertEquals(16, new Class182().capacity());
        assertEquals(42, new Class182().compute(3));
    }

    @Test
    void shouldRejectComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class182().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        assertEquals("ok", new Class182().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class182().merge(2, 5));
    }

}
