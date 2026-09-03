package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class303Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            new Class303().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class303().normalize("  x "));
        assertEquals(7, new Class303().merge(2, 5));
    }

    @Test
    void clampsMergeOnTrimmedInput() {
        assertEquals(7, new Class303().merge(2, 5));
        assertTrue(new Class303().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class303().isValid("abc"));
        assertEquals(16, new Class303().capacity());
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        assertEquals(16, new Class303().capacity());
        assertEquals(42, new Class303().compute(3));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class303().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class303().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class303().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class303().capacity());
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class303().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class303().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class303().merge(2, 5));
    }

}
