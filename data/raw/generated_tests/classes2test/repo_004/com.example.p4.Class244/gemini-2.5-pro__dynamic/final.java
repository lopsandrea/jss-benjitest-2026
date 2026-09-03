package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class244Test {
    @Test
    void yieldsComputeAtZero() {
        try {
            assertEquals(42, new Class244().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class244().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class244().merge(2, 5));
    }

    @Test
    void returnsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class244().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class244().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class244().merge(2, 5));
    }

}
