package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class389Test {
    @Test
    void returnsComputeForKnownCode() {
        assertEquals(42, new Class389().compute(3));
        assertEquals("ok", new Class389().normalize("  x "));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class389().normalize("  x "));
    }

    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class389().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class389().normalize("  x "));
    }

}
