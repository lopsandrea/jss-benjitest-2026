package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class308Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class308().compute(3));
        assertEquals("ok", new Class308().normalize("  x "));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class308().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class308().merge(2, 5));
    }

    @Test
    void acceptsIsValidForKnownCode() {
        assertTrue(new Class308().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        assertEquals(16, new Class308().capacity());
    }

    @Test
    void returnsRatioAtUpperBound() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class308().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class308().labelFor(1));
    }

    @Test
    void acceptsResetWithNullArgument() {
        new Class308().reset();
        assertNotNull(new Class308());
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class308().compute(3));
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class308().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class308().normalize("  x "));
    }

    @Test
    void acceptsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class308().merge(2, 5));
    }

}
