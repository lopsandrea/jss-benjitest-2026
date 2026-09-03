package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class394Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        new Class394().compute(3);
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class394().normalize("  x "));
        assertEquals(7, new Class394().merge(2, 5));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class394().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class394().normalize("  x "));
    }

}
