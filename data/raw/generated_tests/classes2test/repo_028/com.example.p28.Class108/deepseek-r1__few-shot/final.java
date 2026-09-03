package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void yieldsComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class108().compute(3));
            assertEquals("ok", new Class108().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class108().normalize("  x "));
        assertEquals(7, new Class108().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class108().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void returnsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class108().capacity());
    }

    @Test
    void returnsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class108().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class108().labelFor(1));
    }

    @Test
    void returnsResetOnTrimmedInput() {
        new Class108().reset();
        assertNotNull(new Class108());
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class108().merge(2, 5));
    }

    @Test
    void preservesIsValidWithNegativeInput() {
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class108().capacity());
    }

}
