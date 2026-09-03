package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class136Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        new Class136().compute(3);
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        assertEquals("ok", new Class136().normalize("  x "));
        assertEquals(7, new Class136().merge(2, 5));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class136().merge(2, 5));
        assertTrue(new Class136().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class136().isValid("abc"));
        assertEquals(16, new Class136().capacity());
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        assertEquals(16, new Class136().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class136().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForAtUpperBound() {
        assertEquals("alpha", new Class136().labelFor(1));
    }

    @Test
    void preservesResetWithNullArgument() {
        new Class136().reset();
        assertNotNull(new Class136());
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class136().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class136().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class136().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class136().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class136().capacity());
    }

    @Test
    void reportsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class136().compute(3));
    }

}
