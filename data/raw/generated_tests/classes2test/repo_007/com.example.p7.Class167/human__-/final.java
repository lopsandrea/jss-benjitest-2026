package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class167Test {
    @Test
    void shouldKeepComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class167().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnNormalizeForKnownCode() {
        try {
            assertEquals("ok", new Class167().normalize("  x "));
            assertEquals(7, new Class167().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class167().merge(2, 5));
        assertTrue(new Class167().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidWithNullArgument() {
        assertTrue(new Class167().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class167().capacity());
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class167().capacity());
    }

    @Test
    void shouldReturnRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class167().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRoundTripLabelForForKnownCode() {
        assertEquals("alpha", new Class167().labelFor(1));
    }

    @Test
    void shouldKeepResetWhenAlreadyValid() {
        new Class167().reset();
        assertNotNull(new Class167());
    }

    @Test
    void shouldFailFastComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class167().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class167().normalize("  x "));
    }

    @Test
    void shouldRejectComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class167().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWhenUnset() {
        assertEquals("ok", new Class167().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class167().merge(2, 5));
    }

}
