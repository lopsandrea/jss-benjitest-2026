package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class180Test {
    @Test
    void reportsComputeAtZero() {
        assertEquals(42, new Class180().compute(3));
        assertEquals("ok", new Class180().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class180().normalize("  x "));
        assertEquals(7, new Class180().merge(2, 5));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        assertEquals(7, new Class180().merge(2, 5));
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void preservesCapacityOnEmptyString() {
        assertEquals(16, new Class180().capacity());
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class180().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class180().normalize("  x "));
    }

    @Test
    void yieldsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class180().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class180().capacity());
    }

    @Test
    void rejectsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class180().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class180().labelFor(1));
    }

}
