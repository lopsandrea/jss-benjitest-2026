package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class215Test {
    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class215().compute(3));
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class215().normalize("  x "));
    }

    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class215().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class215().normalize("  x "));
    }

}
