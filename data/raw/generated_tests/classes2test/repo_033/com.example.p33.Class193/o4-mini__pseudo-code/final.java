package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class193Test {
    @Test
    void yieldsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class193().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        assertEquals(42, new Class193().compute(3));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class193().normalize("  x "));
    }

}
