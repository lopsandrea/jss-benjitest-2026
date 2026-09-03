package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class387Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class387().compute(3));
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void preservesNormalizeForBoundaryValue() {
        assertEquals("ok", new Class387().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class387().merge(2, 5));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class387().merge(2, 5));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class387().compute(3));
    }

}
