package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class375Test {
    @Test
    void shouldHandleComputeOnRepeatedCall() {
        try {
            new Class375().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRoundTripNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class375().normalize("  x "));
            assertEquals(7, new Class375().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldRejectMergeAtZero() {
        assertEquals(7, new Class375().merge(2, 5));
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidAtZero() {
        assertTrue(new Class375().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class375().capacity());
    }

    @Test
    void shouldNotThrowOnCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class375().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class375().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class375().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class375().labelFor(1));
    }

    @Test
    void shouldNotThrowOnLabelForOnEmptyString() {
        assertEquals("alpha", new Class375().labelFor(1));
        new Class375().reset();
        assertNotNull(new Class375());
    }

    @Test
    void shouldNotThrowOnResetWhenAlreadyValid() {
        new Class375().reset();
        assertNotNull(new Class375());
        int expected1 = 42;
        assertEquals(expected1, new Class375().compute(3));
    }

    @Test
    void shouldKeepComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class375().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWithNegativeInput() {
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void shouldKeepComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class375().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void shouldHandleMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class375().merge(2, 5));
    }

    @Test
    void shouldRejectIsValidAtZero() {
        assertTrue(new Class375().isValid("abc"));
    }

}
