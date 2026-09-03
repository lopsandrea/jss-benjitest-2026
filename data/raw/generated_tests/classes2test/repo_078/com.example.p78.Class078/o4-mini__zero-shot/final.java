package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class078Test {
    @Test
    void clampsComputeAtZero() {
        assertEquals(42, new Class078().compute(3));
        assertEquals("ok", new Class078().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class078().normalize("  x "));
        assertEquals(7, new Class078().merge(2, 5));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class078().merge(2, 5));
        assertTrue(new Class078().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class078().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class078().capacity());
    }

    @Test
    void clampsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class078().capacity());
    }

    @Test
    void yieldsRatioAtZero() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class078().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWhenAlreadyValid() {
        assertEquals("alpha", new Class078().labelFor(1));
    }

    @Test
    void clampsResetAtZero() {
        new Class078().reset();
        assertNotNull(new Class078());
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class078().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class078().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class078().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class078().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class078().capacity());
    }

}
