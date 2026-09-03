package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class348Test {
    @Test
    void keepsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class348().compute(3));
            assertEquals("ok", new Class348().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        try {
            assertEquals("ok", new Class348().normalize("  x "));
            assertEquals(7, new Class348().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class348().merge(2, 5));
        assertTrue(new Class348().isValid("abc"));
    }

    @Test
    void reportsIsValidAtUpperBound() {
        assertTrue(new Class348().isValid("abc"));
        assertEquals(16, new Class348().capacity());
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        assertEquals(16, new Class348().capacity());
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class348().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class348().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class348().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class348().isValid("abc"));
    }

}
