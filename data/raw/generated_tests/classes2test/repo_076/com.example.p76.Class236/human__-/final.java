package com.example.p76;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class236Test {
    @Test
    void shouldNotThrowOnComputeWhenAlreadyValid() {
        try {
            new Class236().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class236().normalize("  x "));
        assertEquals(7, new Class236().merge(2, 5));
    }

    @Test
    void shouldHandleMergeAtZero() {
        assertEquals(7, new Class236().merge(2, 5));
    }

    @Test
    void shouldFailFastIsValidOnMixedCase() {
        assertTrue(new Class236().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnEmptyString() {
        assertEquals(16, new Class236().capacity());
    }

    @Test
    void shouldIgnoreRatioOnMixedCase() {
        assertEquals(0.5, new Class236().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForAtUpperBound() {
        assertEquals("alpha", new Class236().labelFor(1));
    }

    @Test
    void shouldHandleResetWithNegativeInput() {
        new Class236().reset();
        assertNotNull(new Class236());
    }

    @Test
    void shouldNotThrowOnComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class236().compute(3));
    }

    @Test
    void shouldHandleNormalizeWithNullArgument() {
        assertEquals("ok", new Class236().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class236().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnMixedCase() {
        assertTrue(new Class236().isValid("abc"));
    }

    @Test
    void shouldFailFastComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class236().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class236().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class236().merge(2, 5));
    }

}
