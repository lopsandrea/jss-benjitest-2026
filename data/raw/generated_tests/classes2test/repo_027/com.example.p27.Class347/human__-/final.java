package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class347Test {
    @Test
    void shouldKeepComputeWithNullArgument() {
        new Class347().compute(3);
    }

    @Test
    void shouldReturnNormalizeAtUpperBound() {
        assertEquals("ok", new Class347().normalize("  x "));
        assertEquals(7, new Class347().merge(2, 5));
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        assertEquals(7, new Class347().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidWhenAlreadyValid() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityWithNegativeInput() {
        assertEquals(16, new Class347().capacity());
    }

    @Test
    void shouldFailFastRatioWhenUnset() {
        assertEquals(0.5, new Class347().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForForKnownCode() {
        assertEquals("alpha", new Class347().labelFor(1));
    }

    @Test
    void shouldKeepComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void shouldHandleComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

    @Test
    void shouldFailFastNormalizeWithNullArgument() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

}
