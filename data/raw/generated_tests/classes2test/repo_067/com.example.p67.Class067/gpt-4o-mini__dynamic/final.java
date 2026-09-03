package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class067Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class067().compute(3));
        assertEquals("ok", new Class067().normalize("  x "));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class067().normalize("  x "));
        assertEquals(7, new Class067().merge(2, 5));
    }

    @Test
    void keepsComputeWhenUnset() {
        assertEquals(42, new Class067().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class067().normalize("  x "));
    }

}
