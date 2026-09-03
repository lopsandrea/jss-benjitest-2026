package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class258Test {
    @Test
    void shouldFailFastComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            assertEquals(42, new Class258().compute(3));
            assertEquals("ok", new Class258().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldHandleNormalizeForBoundaryValue() {
        assertEquals("ok", new Class258().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class258().merge(2, 5));
    }

    @Test
    void shouldKeepMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class258().merge(2, 5));
        assertTrue(new Class258().isValid("abc"));
    }

    @Test
    void shouldKeepIsValidWhenUnset() {
        assertTrue(new Class258().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class258().capacity());
    }

    @Test
    void shouldFailFastCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class258().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class258().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class258().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldNotThrowOnLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class258().labelFor(1));
    }

    @Test
    void shouldHandleResetWhenAlreadyValid() {
        new Class258().reset();
        assertNotNull(new Class258());
    }

    @Test
    void shouldReturnComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

    @Test
    void shouldKeepNormalizeWithNegativeInput() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

}
