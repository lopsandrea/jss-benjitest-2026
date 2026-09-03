package com.example.p30;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class270Test {
    @Test
    void returnsComputeForBoundaryValue() {
        assertEquals(42, new Class270().compute(3));
        assertEquals("ok", new Class270().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class270().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class270().merge(2, 5));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class270().merge(2, 5));
        assertTrue(new Class270().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class270().isValid("abc"));
    }

    @Test
    void preservesCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class270().capacity());
    }

    @Test
    void keepsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class270().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class270().labelFor(1));
    }

    @Test
    void returnsResetOnMixedCase() {
        new Class270().reset();
        assertNotNull(new Class270());
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

    @Test
    void reportsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class270().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class270().normalize("  x "));
    }

}
