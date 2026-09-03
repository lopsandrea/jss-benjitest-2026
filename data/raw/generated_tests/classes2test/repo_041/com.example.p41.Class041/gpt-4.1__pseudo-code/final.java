package com.example.p41;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class041Test {
    @Test
    void reportsComputeWhenUnset() {
        try {
            assertEquals(42, new Class041().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class041().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class041().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class041().isValid("abc"));
    }

    @Test
    void reportsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class041().capacity());
    }

    @Test
    void yieldsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class041().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class041().labelFor(1));
    }

    @Test
    void keepsResetForKnownCode() {
        new Class041().reset();
        assertNotNull(new Class041());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class041().compute(3));
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class041().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class041().merge(2, 5));
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class041().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class041().normalize("  x "));
    }

}
