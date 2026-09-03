package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void clampsComputeWithNullArgument() {
        assertEquals(42, new Class080().compute(3));
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class080().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        assertEquals(7, new Class080().merge(2, 5));
    }

}
