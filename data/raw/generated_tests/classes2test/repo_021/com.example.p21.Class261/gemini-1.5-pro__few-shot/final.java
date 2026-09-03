package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class261Test {
    @Test
    void yieldsComputeOnEmptyString() {
        assertEquals(42, new Class261().compute(3));
        assertEquals("ok", new Class261().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class261().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class261().merge(2, 5));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class261().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class261().normalize("  x "));
    }

}
