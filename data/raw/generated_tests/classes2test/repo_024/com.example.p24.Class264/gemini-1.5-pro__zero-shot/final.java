package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class264Test {
    @Test
    void reportsComputeWhenAlreadyValid() {
        assertEquals(42, new Class264().compute(3));
        assertEquals("ok", new Class264().normalize("  x "));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class264().compute(3));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class264().normalize("  x "));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class264().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenAlreadyValid() {
        assertTrue(new Class264().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class264().capacity());
    }

    @Test
    void acceptsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class264().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnMixedCase() {
        assertEquals("alpha", new Class264().labelFor(1));
    }

}
