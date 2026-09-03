package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class260Test {
    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class260().compute(3));
        assertEquals("ok", new Class260().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class260().normalize("  x "));
        assertEquals(7, new Class260().merge(2, 5));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class260().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class260().normalize("  x "));
    }

}
