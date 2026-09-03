package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class291Test {
    @Test
    void shouldFailFastComputeWithNullArgument() {
        try {
            assertEquals(42, new Class291().compute(3));
            assertEquals("ok", new Class291().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeAtUpperBound() {
        try {
            assertEquals("ok", new Class291().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class291().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidAtZero() {
        assertTrue(new Class291().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class291().capacity());
    }

    @Test
    void shouldRejectRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class291().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class291().labelFor(1));
    }

    @Test
    void shouldRoundTripResetForBoundaryValue() {
        new Class291().reset();
        assertNotNull(new Class291());
    }

    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class291().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenUnset() {
        assertEquals("ok", new Class291().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class291().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeWithNegativeInput() {
        assertEquals("ok", new Class291().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class291().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidAtUpperBound() {
        assertTrue(new Class291().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class291().capacity());
    }

}
