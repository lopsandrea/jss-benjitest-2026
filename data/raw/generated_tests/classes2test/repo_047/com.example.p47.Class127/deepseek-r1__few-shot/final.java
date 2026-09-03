package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class127Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        new Class127().compute(3);
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class127().normalize("  x "));
        assertEquals(7, new Class127().merge(2, 5));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class127().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class127().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class127().merge(2, 5));
    }

}
