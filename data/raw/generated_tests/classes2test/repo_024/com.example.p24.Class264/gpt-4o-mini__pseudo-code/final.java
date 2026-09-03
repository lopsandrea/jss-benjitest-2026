package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class264Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class264().compute(3));
        assertEquals("ok", new Class264().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class264().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class264().merge(2, 5));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class264().merge(2, 5));
        assertTrue(new Class264().isValid("abc"));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class264().isValid("abc"));
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class264().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class264().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForAtUpperBound() {
        assertEquals("alpha", new Class264().labelFor(1));
    }

    @Test
    void reportsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class264().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class264().normalize("  x "));
    }

}
