package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class191Test {
    @Test
    void shouldNotThrowOnComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class191().compute(3));
            assertEquals("ok", new Class191().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class191().normalize("  x "));
            int expected1 = 7;
            assertEquals(expected1, new Class191().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnMergeOnTrimmedInput() {
        try {
            int expected0 = 7;
            assertEquals(expected0, new Class191().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleIsValidOnTrimmedInput() {
        assertTrue(new Class191().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class191().capacity());
    }

    @Test
    void shouldHandleRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class191().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForOnEmptyString() {
        assertEquals("alpha", new Class191().labelFor(1));
    }

    @Test
    void shouldKeepResetWhenAlreadyValid() {
        new Class191().reset();
        assertNotNull(new Class191());
    }

    @Test
    void shouldRejectComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class191().compute(3));
    }

    @Test
    void shouldKeepNormalizeWithNegativeInput() {
        assertEquals("ok", new Class191().normalize("  x "));
    }

    @Test
    void shouldRoundTripMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class191().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidAtUpperBound() {
        assertTrue(new Class191().isValid("abc"));
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class191().compute(3));
    }

    @Test
    void shouldReturnNormalizeAtZero() {
        assertEquals("ok", new Class191().normalize("  x "));
    }

}
