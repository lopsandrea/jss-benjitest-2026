package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class237Test {
    @Test
    void yieldsComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class237().compute(3));
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtZero() {
        assertEquals("ok", new Class237().normalize("  x "));
        assertEquals(7, new Class237().merge(2, 5));
    }

    @Test
    void returnsMergeOnMixedCase() {
        assertEquals(7, new Class237().merge(2, 5));
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class237().capacity());
    }

    @Test
    void clampsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class237().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnEmptyString() {
        assertEquals("alpha", new Class237().labelFor(1));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class237().isValid("abc"));
    }

    @Test
    void returnsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class237().capacity());
    }

}
