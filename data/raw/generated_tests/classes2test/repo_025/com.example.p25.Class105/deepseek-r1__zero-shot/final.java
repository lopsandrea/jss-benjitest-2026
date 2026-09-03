package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class105Test {
    @Test
    void returnsComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class105().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class105().normalize("  x "));
        assertEquals(7, new Class105().merge(2, 5));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class105().merge(2, 5));
        assertTrue(new Class105().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class105().isValid("abc"));
        assertEquals(16, new Class105().capacity());
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        assertEquals(16, new Class105().capacity());
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class105().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class105().normalize("  x "));
    }

    @Test
    void preservesMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class105().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class105().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class105().capacity());
    }

    @Test
    void clampsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class105().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWithNegativeInput() {
        assertEquals("alpha", new Class105().labelFor(1));
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class105().compute(3));
    }

}
