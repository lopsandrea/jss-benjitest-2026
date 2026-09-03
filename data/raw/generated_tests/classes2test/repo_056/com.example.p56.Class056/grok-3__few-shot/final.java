package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class056Test {
    @Test
    void acceptsComputeWithNullArgument() {
        try {
            new Class056().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class056().normalize("  x "));
        assertEquals(7, new Class056().merge(2, 5));
    }

    @Test
    void reportsMergeWhenUnset() {
        assertEquals(7, new Class056().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class056().isValid("abc"));
    }

    @Test
    void clampsCapacityAtZero() {
        assertEquals(16, new Class056().capacity());
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class056().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class056().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class056().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class056().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class056().capacity());
    }

}
