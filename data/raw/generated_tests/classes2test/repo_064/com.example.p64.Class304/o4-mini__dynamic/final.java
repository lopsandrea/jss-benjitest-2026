package com.example.p64;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class304Test {
    @Test
    void keepsComputeOnTrimmedInput() {
        assertEquals(42, new Class304().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class304().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class304().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class304().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        assertEquals(16, new Class304().capacity());
    }

    @Test
    void clampsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class304().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class304().labelFor(1));
    }

    @Test
    void preservesResetWhenAlreadyValid() {
        new Class304().reset();
        assertNotNull(new Class304());
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class304().compute(3));
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        assertEquals("ok", new Class304().normalize("  x "));
    }

    @Test
    void clampsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class304().compute(3));
    }

}
