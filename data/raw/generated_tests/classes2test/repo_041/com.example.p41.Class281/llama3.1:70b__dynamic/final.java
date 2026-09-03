package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class281Test {
    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class281().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

    @Test
    void reportsComputeWithNullArgument() {
        assertEquals(42, new Class281().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class281().normalize("  x "));
    }

}
