package com.example.p72;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class232Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class232().compute(3);
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        new Class232().normalize("  x ");
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class232().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class232().normalize("  x "));
    }

}
