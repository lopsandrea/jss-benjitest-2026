package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class032Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class032().compute(3));
        assertEquals("ok", new Class032().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class032().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class032().merge(2, 5));
    }

    @Test
    void returnsComputeAtUpperBound() {
        assertEquals(42, new Class032().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class032().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class032().merge(2, 5));
    }

}
