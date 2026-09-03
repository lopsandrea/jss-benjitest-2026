package com.example.p52;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class372Test {
    @Test
    void shouldIgnoreComputeForKnownCode() {
        try {
            new Class372().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeOnEmptyString() {
        assertEquals("ok", new Class372().normalize("  x "));
        assertEquals(7, new Class372().merge(2, 5));
    }

    @Test
    void shouldRoundTripMergeOnEmptyString() {
        assertEquals(7, new Class372().merge(2, 5));
        assertTrue(new Class372().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnIsValidOnTrimmedInput() {
        assertTrue(new Class372().isValid("abc"));
        assertEquals(16, new Class372().capacity());
    }

    @Test
    void shouldFailFastCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class372().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class372().compute(3));
    }

    @Test
    void shouldNotThrowOnComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class372().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class372().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class372().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidForBoundaryValue() {
        assertTrue(new Class372().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class372().capacity());
    }

    @Test
    void shouldRoundTripComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class372().compute(3));
    }

    @Test
    void shouldHandleNormalizeWithNegativeInput() {
        assertEquals("ok", new Class372().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class372().merge(2, 5));
    }

    @Test
    void shouldReturnComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class372().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class372().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class372().merge(2, 5));
    }

    @Test
    void shouldRoundTripIsValidWhenUnset() {
        assertTrue(new Class372().isValid("abc"));
    }

    @Test
    void shouldRoundTripCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class372().capacity());
    }

    @Test
    void shouldNotThrowOnComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class372().compute(3));
    }

}
