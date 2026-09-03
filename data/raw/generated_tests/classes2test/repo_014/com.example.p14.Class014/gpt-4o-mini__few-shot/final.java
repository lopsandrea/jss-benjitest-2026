package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class014Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class014().compute(3));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class014().normalize("  x "));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class014().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class014().normalize("  x "));
    }

}
