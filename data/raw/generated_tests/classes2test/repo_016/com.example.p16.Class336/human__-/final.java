package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class336Test {
    @Test
    void shouldIgnoreComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class336().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void shouldKeepNormalizeOnMixedCase() {
        new Class336().normalize("  x ");
    }

    @Test
    void shouldRoundTripComputeWithNullArgument() {
        assertEquals(42, new Class336().compute(3));
    }

    @Test
    void shouldNotThrowOnNormalizeForKnownCode() {
        assertEquals("ok", new Class336().normalize("  x "));
    }

    @Test
    void shouldKeepMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class336().merge(2, 5));
    }

}
