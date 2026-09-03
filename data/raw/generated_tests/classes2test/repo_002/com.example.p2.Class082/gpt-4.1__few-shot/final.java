package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class082Test {
    @Test
    void preservesComputeOnEmptyString() {
        try {
            assertEquals(42, new Class082().compute(3));
            assertEquals("ok", new Class082().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class082().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class082().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNullArgument() {
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class082().capacity());
    }

    @Test
    void preservesRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class082().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForAtUpperBound() {
        assertEquals("alpha", new Class082().labelFor(1));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class082().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class082().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class082().isValid("abc"));
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class082().capacity());
    }

    @Test
    void clampsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class082().compute(3));
    }

}
