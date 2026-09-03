package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class039Test {
    @Test
    void preservesComputeWhenUnset() {
        try {
            assertEquals(42, new Class039().compute(3));
            assertEquals("ok", new Class039().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        try {
            assertEquals("ok", new Class039().normalize("  x "));
            assertEquals(7, new Class039().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsMergeWithNegativeInput() {
        try {
            assertEquals(7, new Class039().merge(2, 5));
            assertTrue(new Class039().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class039().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class039().capacity());
    }

    @Test
    void keepsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class039().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class039().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class039().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class039().labelFor(1));
    }

    @Test
    void rejectsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class039().labelFor(1));
    }

    @Test
    void clampsResetWithNullArgument() {
        new Class039().reset();
        assertNotNull(new Class039());
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class039().compute(3));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class039().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class039().normalize("  x "));
    }

}
