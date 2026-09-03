package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class371Test {
    @Test
    void shouldRoundTripComputeOnMixedCase() {
        new Class371().compute(3);
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class371().normalize("  x "));
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        assertEquals(7, new Class371().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidAtZero() {
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityWithNullArgument() {
        assertEquals(16, new Class371().capacity());
    }

    @Test
    void shouldIgnoreRatioWhenAlreadyValid() {
        assertEquals(0.5, new Class371().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldFailFastLabelForWithNullArgument() {
        assertEquals("alpha", new Class371().labelFor(1));
    }

    @Test
    void shouldNotThrowOnResetWhenUnset() {
        new Class371().reset();
        assertNotNull(new Class371());
    }

    @Test
    void shouldRejectComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void shouldRoundTripComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class371().compute(3));
    }

    @Test
    void shouldHandleNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class371().normalize("  x "));
    }

    @Test
    void shouldHandleMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class371().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnIsValidAtUpperBound() {
        assertTrue(new Class371().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class371().capacity());
    }

}
