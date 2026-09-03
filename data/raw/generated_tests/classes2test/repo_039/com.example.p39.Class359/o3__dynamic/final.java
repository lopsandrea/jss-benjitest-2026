package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class359Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class359().compute(3));
            assertEquals("ok", new Class359().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class359().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class359().merge(2, 5));
    }

    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class359().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class359().normalize("  x "));
    }

}
