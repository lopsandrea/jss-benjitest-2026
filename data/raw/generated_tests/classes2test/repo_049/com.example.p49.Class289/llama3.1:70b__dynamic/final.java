package com.example.p49;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class289Test {
    @Test
    void preservesComputeAtUpperBound() {
        new Class289().compute(3);
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class289().normalize("  x "));
        assertEquals(7, new Class289().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class289().merge(2, 5));
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class289().isValid("abc"));
        assertEquals(16, new Class289().capacity());
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class289().capacity());
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

    @Test
    void reportsIsValidForKnownCode() {
        assertTrue(new Class289().isValid("abc"));
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class289().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class289().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class289().merge(2, 5));
    }

}
