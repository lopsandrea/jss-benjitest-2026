package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {
    @Test
    void clampsComputeOnMixedCase() {
        assertEquals(42, new Class045().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class045().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

}
