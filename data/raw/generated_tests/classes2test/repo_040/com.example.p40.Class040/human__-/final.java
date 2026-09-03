package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class040Test {
    @Test
    void shouldIgnoreComputeAtUpperBound() {
        assertEquals(42, new Class040().compute(3));
        assertEquals("ok", new Class040().normalize("  x "));
    }

    @Test
    void shouldRejectNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class040().normalize("  x "));
    }

    @Test
    void shouldFailFastMergeForKnownCode() {
        assertEquals(7, new Class040().merge(2, 5));
    }

    @Test
    void shouldRejectComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class040().compute(3));
    }

    @Test
    void shouldRejectNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class040().normalize("  x "));
    }

    @Test
    void shouldReturnMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class040().merge(2, 5));
    }

}
