package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class030Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class030().compute(3));
        assertEquals("ok", new Class030().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class030().normalize("  x "));
        assertEquals(7, new Class030().merge(2, 5));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class030().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class030().normalize("  x "));
    }

    @Test
    void reportsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class030().merge(2, 5));
    }

}
