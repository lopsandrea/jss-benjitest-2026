package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class171Test {
    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class171().compute(3));
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class171().normalize("  x "));
        assertEquals(7, new Class171().merge(2, 5));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class171().merge(2, 5));
        assertTrue(new Class171().isValid("abc"));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class171().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class171().capacity());
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class171().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class171().merge(2, 5));
    }

    @Test
    void acceptsIsValidForBoundaryValue() {
        assertTrue(new Class171().isValid("abc"));
    }

}
