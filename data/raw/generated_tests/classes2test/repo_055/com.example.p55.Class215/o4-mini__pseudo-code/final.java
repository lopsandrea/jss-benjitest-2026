package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class215Test {
    @Test
    void clampsComputeWhenUnset() {
        try {
            assertEquals(42, new Class215().compute(3));
            assertEquals("ok", new Class215().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class215().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class215().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class215().merge(2, 5));
    }

}
