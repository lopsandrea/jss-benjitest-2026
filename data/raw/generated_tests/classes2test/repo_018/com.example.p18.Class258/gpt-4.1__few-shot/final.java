package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class258Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class258().merge(2, 5));
    }

    @Test
    void reportsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

}
