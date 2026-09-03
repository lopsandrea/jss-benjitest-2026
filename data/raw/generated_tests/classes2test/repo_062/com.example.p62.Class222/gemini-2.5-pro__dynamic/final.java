package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class222Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class222().compute(3));
        assertEquals("ok", new Class222().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenUnset() {
        assertEquals("ok", new Class222().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class222().merge(2, 5));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class222().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class222().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class222().merge(2, 5));
    }

}
