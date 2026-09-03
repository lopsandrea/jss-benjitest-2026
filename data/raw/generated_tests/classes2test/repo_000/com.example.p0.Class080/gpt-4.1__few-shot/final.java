package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void yieldsComputeWhenUnset() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class080().compute(3));
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void clampsMergeAtUpperBound() {
        assertEquals(7, new Class080().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void yieldsCapacityForKnownCode() {
        assertEquals(16, new Class080().capacity());
    }

    @Test
    void acceptsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

}
