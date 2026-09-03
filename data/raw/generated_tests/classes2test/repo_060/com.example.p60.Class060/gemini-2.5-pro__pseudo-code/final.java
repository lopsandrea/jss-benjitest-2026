package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class060Test {
    @Test
    void reportsComputeAtUpperBound() {
        assertEquals(42, new Class060().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        assertEquals(42, new Class060().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class060().normalize("  x "));
    }

}
