package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class000Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class000().compute(3));
        assertEquals("ok", new Class000().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class000().normalize("  x "));
        assertEquals(7, new Class000().merge(2, 5));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class000().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class000().normalize("  x "));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class000().merge(2, 5));
    }

}
