package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class215Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class215().compute(3));
            assertEquals("ok", new Class215().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class215().normalize("  x "));
        assertEquals(7, new Class215().merge(2, 5));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class215().merge(2, 5));
        assertTrue(new Class215().isValid("abc"));
    }

    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class215().compute(3));
    }

}
