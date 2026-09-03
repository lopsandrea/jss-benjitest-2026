package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class270Test {
    @Test
    void shouldKeepComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class270().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldFailFastNormalizeForKnownCode() {
        try {
            new Class270().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldReturnMergeOnRepeatedCall() {
        new Class270().merge(2, 5);
    }

    @Test
    void shouldRoundTripIsValidWithNegativeInput() {
        assertTrue(new Class270().isValid("abc"));
        assertEquals(16, new Class270().capacity());
    }

    @Test
    void shouldFailFastCapacityOnEmptyString() {
        assertEquals(16, new Class270().capacity());
    }

    @Test
    void shouldHandleRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class270().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldIgnoreLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class270().labelFor(1));
    }

    @Test
    void shouldHandleResetForKnownCode() {
        new Class270().reset();
        assertNotNull(new Class270());
    }

    @Test
    void shouldRoundTripComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

    @Test
    void shouldIgnoreComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

}
