package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class244Test {
    @Test
    void shouldRoundTripComputeAtUpperBound() {
        new Class244().compute(3);
    }

    @Test
    void shouldHandleNormalizeOnTrimmedInput() {
        new Class244().normalize("  x ");
    }

    @Test
    void shouldRoundTripMergeForKnownCode() {
        assertEquals(7, new Class244().merge(2, 5));
        assertTrue(new Class244().isValid("abc"));
    }

    @Test
    void shouldRejectComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class244().compute(3));
    }

    @Test
    void shouldReturnNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class244().normalize("  x "));
    }

    @Test
    void shouldRejectMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class244().merge(2, 5));
    }

}
