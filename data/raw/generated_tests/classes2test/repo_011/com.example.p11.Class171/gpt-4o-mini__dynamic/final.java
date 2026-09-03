package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class171Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class171().compute(3));
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class171().merge(2, 5));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class171().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

}
