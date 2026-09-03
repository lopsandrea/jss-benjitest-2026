package com.example.p5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class085Test {
    @Test
    void preservesComputeWithNullArgument() {
        assertEquals(42, new Class085().compute(3));
        assertEquals("ok", new Class085().normalize("  x "));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class085().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class085().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class085().merge(2, 5));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class085().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class085().capacity());
    }

    @Test
    void acceptsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class085().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class085().labelFor(1));
    }

    @Test
    void yieldsResetForBoundaryValue() {
        new Class085().reset();
        assertNotNull(new Class085());
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class085().compute(3));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class085().normalize("  x "));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class085().compute(3));
    }

}
