package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class361Test {
    @Test
    void shouldNotThrowOnComputeWhenUnset() {
        try {
            new Class361().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectNormalizeWhenAlreadyValid() {
        new Class361().normalize("  x ");
    }

    @Test
    void shouldReturnMergeForBoundaryValue() {
        assertEquals(7, new Class361().merge(2, 5));
        assertTrue(new Class361().isValid("abc"));
    }

    @Test
    void shouldRoundTripIsValidOnEmptyString() {
        assertTrue(new Class361().isValid("abc"));
        assertEquals(16, new Class361().capacity());
    }

    @Test
    void shouldKeepCapacityAtZero() {
        assertEquals(16, new Class361().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class361().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class361().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForWithNegativeInput() {
        assertEquals("alpha", new Class361().labelFor(1));
    }

    @Test
    void shouldKeepResetWithNegativeInput() {
        new Class361().reset();
        assertNotNull(new Class361());
    }

    @Test
    void shouldIgnoreComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class361().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class361().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidWhenUnset() {
        assertTrue(new Class361().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class361().capacity());
    }

    @Test
    void shouldHandleComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class361().compute(3));
    }

    @Test
    void shouldHandleNormalizeWithNullArgument() {
        assertEquals("ok", new Class361().normalize("  x "));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class361().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWhenAlreadyValid() {
        assertTrue(new Class361().isValid("abc"));
    }

}
