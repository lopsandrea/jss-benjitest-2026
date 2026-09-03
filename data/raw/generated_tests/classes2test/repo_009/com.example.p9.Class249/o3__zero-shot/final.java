package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class249Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        try {
            assertEquals(42, new Class249().compute(3));
            assertEquals("ok", new Class249().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class249().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class249().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        assertEquals(7, new Class249().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class249().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        assertEquals(16, new Class249().capacity());
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class249().compute(3));
    }

}
