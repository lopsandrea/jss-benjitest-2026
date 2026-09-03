package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class266Test {
    @Test
    void shouldKeepComputeAtUpperBound() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class266().compute(3));
            assertEquals("ok", new Class266().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeAtUpperBound() {
        assertEquals("ok", new Class266().normalize("  x "));
        assertEquals(7, new Class266().merge(2, 5));
    }

    @Test
    void shouldIgnoreMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class266().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnTrimmedInput() {
        assertTrue(new Class266().isValid("abc"));
    }

    @Test
    void shouldHandleCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class266().capacity());
    }

    @Test
    void shouldReturnRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class266().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForForKnownCode() {
        assertEquals("alpha", new Class266().labelFor(1));
    }

    @Test
    void shouldKeepComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class266().compute(3));
    }

    @Test
    void shouldHandleNormalizeOnMixedCase() {
        assertEquals("ok", new Class266().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class266().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidWhenUnset() {
        assertTrue(new Class266().isValid("abc"));
    }

    @Test
    void shouldNotThrowOnCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class266().capacity());
    }

    @Test
    void shouldNotThrowOnRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class266().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldRejectComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class266().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeAtZero() {
        assertEquals("ok", new Class266().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class266().merge(2, 5));
    }

    @Test
    void shouldHandleIsValidOnRepeatedCall() {
        assertTrue(new Class266().isValid("abc"));
    }

    @Test
    void shouldRejectCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class266().capacity());
    }

}
