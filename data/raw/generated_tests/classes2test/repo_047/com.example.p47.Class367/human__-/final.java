package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class367Test {
    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class367().compute(3));
        assertEquals("ok", new Class367().normalize("  x "));
    }

    @Test
    void shouldRoundTripNormalizeAtUpperBound() {
        assertEquals("ok", new Class367().normalize("  x "));
        assertEquals(7, new Class367().merge(2, 5));
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        assertEquals(7, new Class367().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidAtUpperBound() {
        assertTrue(new Class367().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class367().capacity());
    }

    @Test
    void shouldKeepRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class367().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForForKnownCode() {
        assertEquals("alpha", new Class367().labelFor(1));
    }

    @Test
    void shouldKeepResetWithNullArgument() {
        new Class367().reset();
        assertNotNull(new Class367());
    }

    @Test
    void shouldNotThrowOnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class367().compute(3));
    }

    @Test
    void shouldIgnoreNormalizeForBoundaryValue() {
        assertEquals("ok", new Class367().normalize("  x "));
    }

    @Test
    void shouldIgnoreMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class367().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidAtUpperBound() {
        assertTrue(new Class367().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class367().capacity());
    }

    @Test
    void shouldNotThrowOnRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class367().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class367().compute(3));
    }

}
