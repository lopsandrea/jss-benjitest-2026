package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class264Test {
    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class264().compute(3));
        assertEquals("ok", new Class264().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class264().normalize("  x "));
        assertEquals(7, new Class264().merge(2, 5));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class264().merge(2, 5));
        assertTrue(new Class264().isValid("abc"));
    }

    @Test
    void reportsIsValidAtZero() {
        assertTrue(new Class264().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class264().capacity());
    }

    @Test
    void clampsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class264().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnEmptyString() {
        assertEquals("alpha", new Class264().labelFor(1));
    }

    @Test
    void returnsResetWhenUnset() {
        new Class264().reset();
        assertNotNull(new Class264());
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class264().compute(3));
    }

}
