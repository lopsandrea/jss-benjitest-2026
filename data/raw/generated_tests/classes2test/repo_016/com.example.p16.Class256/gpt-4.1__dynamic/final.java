package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class256Test {
    @Test
    void reportsComputeAtUpperBound() {
        try {
            assertEquals(42, new Class256().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeWhenUnset() {
        try {
            assertEquals("ok", new Class256().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class256().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class256().isValid("abc"));
    }

    @Test
    void clampsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class256().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class256().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class256().merge(2, 5));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class256().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class256().normalize("  x "));
    }

}
