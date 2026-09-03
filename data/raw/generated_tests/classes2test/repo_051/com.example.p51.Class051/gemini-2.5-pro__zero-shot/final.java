package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class051().compute(3));
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class051().normalize("  x "));
        assertEquals(7, new Class051().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class051().merge(2, 5));
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class051().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class051().capacity());
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class051().capacity());
    }

    @Test
    void keepsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class051().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class051().compute(3));
    }

}
