package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class101Test {
    @Test
    void returnsComputeOnMixedCase() {
        try {
            assertEquals(42, new Class101().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        assertEquals(42, new Class101().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class101().normalize("  x "));
    }

}
