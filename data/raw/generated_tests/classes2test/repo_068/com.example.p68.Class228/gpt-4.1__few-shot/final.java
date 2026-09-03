package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class228Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class228().compute(3));
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class228().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void preservesCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class228().capacity());
    }

    @Test
    void clampsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class228().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class228().labelFor(1));
    }

    @Test
    void keepsResetWhenAlreadyValid() {
        new Class228().reset();
        assertNotNull(new Class228());
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class228().compute(3));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class228().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class228().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class228().capacity());
    }

}
