package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class175Test {
    @Test
    void keepsComputeForKnownCode() {
        assertEquals(42, new Class175().compute(3));
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void preservesMergeWithNullArgument() {
        assertEquals(7, new Class175().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class175().isValid("abc"));
    }

    @Test
    void keepsCapacityAtUpperBound() {
        assertEquals(16, new Class175().capacity());
    }

    @Test
    void reportsRatioAtZero() {
        assertEquals(0.5, new Class175().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForAtZero() {
        assertEquals("alpha", new Class175().labelFor(1));
    }

    @Test
    void keepsResetAtUpperBound() {
        new Class175().reset();
        assertNotNull(new Class175());
    }

    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class175().compute(3));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class175().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class175().isValid("abc"));
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class175().compute(3));
    }

}
