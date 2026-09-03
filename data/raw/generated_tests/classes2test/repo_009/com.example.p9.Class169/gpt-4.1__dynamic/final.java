package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class169Test {
    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class169().compute(3));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void clampsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class169().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void yieldsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void returnsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class169().compute(3));
    }

}
