package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class071Test {
    @Test
    void shouldFailFastComputeOnTrimmedInput() {
        new Class071().compute(3);
    }

    @Test
    void shouldIgnoreNormalizeOnEmptyString() {
        assertEquals("ok", new Class071().normalize("  x "));
        assertEquals(7, new Class071().merge(2, 5));
    }

    @Test
    void shouldReturnMergeWithNegativeInput() {
        assertEquals(7, new Class071().merge(2, 5));
        assertTrue(new Class071().isValid("abc"));
    }

    @Test
    void shouldFailFastIsValidOnRepeatedCall() {
        assertTrue(new Class071().isValid("abc"));
    }

    @Test
    void shouldIgnoreCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class071().capacity());
    }

    @Test
    void shouldNotThrowOnRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class071().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldReturnLabelForWhenUnset() {
        assertEquals("alpha", new Class071().labelFor(1));
    }

    @Test
    void shouldKeepComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class071().compute(3));
    }

    @Test
    void shouldRejectNormalizeWhenUnset() {
        assertEquals("ok", new Class071().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class071().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnRepeatedCall() {
        assertTrue(new Class071().isValid("abc"));
    }

    @Test
    void shouldKeepCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class071().capacity());
    }

    @Test
    void shouldHandleRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class071().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class071().labelFor(1));
    }

    @Test
    void shouldFailFastComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class071().compute(3));
    }

    @Test
    void shouldFailFastComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class071().compute(3));
    }

}
