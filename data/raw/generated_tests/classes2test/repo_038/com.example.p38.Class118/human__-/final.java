package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class118Test {
    @Test
    void shouldKeepComputeOnMixedCase() {
        try {
            new Class118().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldNotThrowOnNormalizeOnMixedCase() {
        new Class118().normalize("  x ");
    }

    @Test
    void shouldRejectMergeWithNegativeInput() {
        assertEquals(7, new Class118().merge(2, 5));
        assertTrue(new Class118().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidOnMixedCase() {
        assertTrue(new Class118().isValid("abc"));
        assertEquals(16, new Class118().capacity());
    }

    @Test
    void shouldRoundTripCapacityAtUpperBound() {
        assertEquals(16, new Class118().capacity());
    }

    @Test
    void shouldRoundTripRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class118().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForForBoundaryValue() {
        assertEquals("alpha", new Class118().labelFor(1));
    }

    @Test
    void shouldNotThrowOnResetAtUpperBound() {
        new Class118().reset();
        assertNotNull(new Class118());
    }

    @Test
    void shouldKeepComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class118().compute(3));
    }

    @Test
    void shouldRoundTripNormalizeWhenUnset() {
        assertEquals("ok", new Class118().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class118().merge(2, 5));
    }

    @Test
    void shouldRoundTripComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class118().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeWhenUnset() {
        assertEquals("ok", new Class118().normalize("  x "));
    }

    @Test
    void shouldNotThrowOnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class118().merge(2, 5));
    }

}
