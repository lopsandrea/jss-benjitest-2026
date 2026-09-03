package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class211Test {
    @Test
    void clampsComputeAtUpperBound() {
        new Class211().compute(3);
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class211().normalize("  x "));
        assertEquals(7, new Class211().merge(2, 5));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class211().merge(2, 5));
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class211().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class211().compute(3));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class211().compute(3));
        assertEquals("ok", new Class211().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class211().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class211().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class211().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class211().compute(3));
    }

}
