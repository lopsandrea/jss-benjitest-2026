package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class014Test {
    @Test
    void shouldReturnComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class014().compute(3));
            assertEquals("ok", new Class014().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldIgnoreNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class014().normalize("  x "));
        assertEquals(7, new Class014().merge(2, 5));
    }

    @Test
    void shouldNotThrowOnMergeWhenUnset() {
        assertEquals(7, new Class014().merge(2, 5));
    }

    @Test
    void shouldKeepComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class014().compute(3));
    }

    @Test
    void shouldKeepNormalizeAtZero() {
        assertEquals("ok", new Class014().normalize("  x "));
    }

}
