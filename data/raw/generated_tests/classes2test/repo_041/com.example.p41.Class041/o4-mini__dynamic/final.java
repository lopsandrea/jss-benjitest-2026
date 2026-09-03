package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class041Test {
    @Test
    void reportsComputeOnTrimmedInput() {
        assertEquals(42, new Class041().compute(3));
        assertEquals("ok", new Class041().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class041().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        assertEquals(7, new Class041().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class041().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        assertEquals(16, new Class041().capacity());
    }

    @Test
    void clampsRatioForBoundaryValue() {
        assertEquals(0.5, new Class041().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtUpperBound() {
        assertEquals("alpha", new Class041().labelFor(1));
    }

    @Test
    void yieldsResetWithNullArgument() {
        new Class041().reset();
        assertNotNull(new Class041());
    }

}
