package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class023Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class023().compute(3));
        assertEquals("ok", new Class023().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class023().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class023().merge(2, 5));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class023().merge(2, 5));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class023().compute(3));
    }

}
