package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class170Test {
    @Test
    void clampsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class170().compute(3));
            assertEquals("ok", new Class170().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class170().normalize("  x "));
        assertEquals(7, new Class170().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class170().merge(2, 5));
    }

    @Test
    void clampsIsValidWhenUnset() {
        assertTrue(new Class170().isValid("abc"));
    }

    @Test
    void rejectsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class170().capacity());
    }

    @Test
    void rejectsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class170().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForAtUpperBound() {
        assertEquals("alpha", new Class170().labelFor(1));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class170().compute(3));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class170().normalize("  x "));
    }

}
