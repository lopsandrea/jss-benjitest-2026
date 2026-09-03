package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class259Test {
    @Test
    void shouldKeepComputeForKnownCode() {
        new Class259().compute(3);
    }

    @Test
    void shouldHandleNormalizeOnRepeatedCall() {
        new Class259().normalize("  x ");
    }

    @Test
    void shouldRoundTripMergeForKnownCode() {
        assertEquals(7, new Class259().merge(2, 5));
        assertTrue(new Class259().isValid("abc"));
    }

    @Test
    void shouldKeepComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class259().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeOnEmptyString() {
        assertEquals("ok", new Class259().normalize("  x "));
    }

    @Test
    void shouldRejectMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class259().merge(2, 5));
    }

}
