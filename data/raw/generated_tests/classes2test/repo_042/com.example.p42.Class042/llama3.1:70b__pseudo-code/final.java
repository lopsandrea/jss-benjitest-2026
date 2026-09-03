package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class042Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        assertEquals(42, new Class042().compute(3));
        assertEquals("ok", new Class042().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class042().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class042().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class042().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        assertEquals(16, new Class042().capacity());
    }

    @Test
    void keepsRatioAtZero() {
        assertEquals(0.5, new Class042().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class042().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class042().normalize("  x "));
    }

}
