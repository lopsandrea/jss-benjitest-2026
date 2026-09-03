package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class117Test {
    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class117().compute(3));
        assertEquals("ok", new Class117().normalize("  x "));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class117().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class117().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class117().merge(2, 5));
    }

}
