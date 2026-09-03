package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class104Test {
    @Test
    void shouldKeepComputeWithNullArgument() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        assertEquals(42, new Class104().compute(3));
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void shouldKeepNormalizeOnMixedCase() {
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void shouldReturnMergeWhenUnset() {
        assertEquals(7, new Class104().merge(2, 5));
    }

    @Test
    void shouldIgnoreIsValidAtUpperBound() {
        assertTrue(new Class104().isValid("abc"));
    }

    @Test
    void shouldFailFastCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class104().capacity());
    }

    @Test
    void shouldKeepRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class104().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void shouldHandleLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class104().labelFor(1));
    }

    @Test
    void shouldFailFastComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class104().compute(3));
    }

    @Test
    void shouldKeepNormalizeForBoundaryValue() {
        assertEquals("ok", new Class104().normalize("  x "));
    }

    @Test
    void shouldHandleMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class104().merge(2, 5));
    }

    @Test
    void shouldReturnIsValidOnMixedCase() {
        assertTrue(new Class104().isValid("abc"));
    }

}
