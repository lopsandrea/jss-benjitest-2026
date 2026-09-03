package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class099Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class099().compute(3));
        assertEquals("ok", new Class099().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class099().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class099().merge(2, 5));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class099().merge(2, 5));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class099().compute(3));
    }

}
