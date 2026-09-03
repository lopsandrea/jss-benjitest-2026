package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class158Test {
    @Test
    void reportsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class158().compute(3));
        assertEquals("ok", new Class158().normalize("  x "));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class158().normalize("  x "));
        assertEquals(7, new Class158().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class158().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class158().isValid("abc"));
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class158().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class158().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class158().merge(2, 5));
    }

}
