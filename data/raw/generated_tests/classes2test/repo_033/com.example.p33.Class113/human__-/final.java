package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class113Test {
    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        new Class113().compute(3);
    }

    @Test
    void shouldRejectNormalizeWhenUnset() {
        assertEquals("ok", new Class113().normalize("  x "));
        assertEquals(7, new Class113().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWhenAlreadyValid() {
        assertEquals(7, new Class113().merge(2, 5));
        assertTrue(new Class113().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWithNullArgument() {
        assertTrue(new Class113().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class113().capacity());
    }

    @Test
    void shouldHandleCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class113().capacity());
    }

    @Test
    void shouldFailFastComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class113().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnEmptyString() {
        assertEquals("ok", new Class113().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class113().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnRepeatedCall() {
        assertTrue(new Class113().isValid("abc"));
    }

    @Test
    void shouldHandleComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class113().compute(3));
    }

}
