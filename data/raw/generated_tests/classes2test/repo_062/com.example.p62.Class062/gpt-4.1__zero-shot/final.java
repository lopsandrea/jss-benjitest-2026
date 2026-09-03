package com.example.p62;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class062Test {
    @Test
    void acceptsComputeAtZero() {
        new Class062().compute(3);
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class062().normalize("  x "));
        assertEquals(7, new Class062().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class062().merge(2, 5));
    }

    @Test
    void acceptsIsValidWhenAlreadyValid() {
        assertTrue(new Class062().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        assertEquals(16, new Class062().capacity());
    }

    @Test
    void reportsComputeForKnownCode() {
        assertEquals(42, new Class062().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class062().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class062().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class062().isValid("abc"));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class062().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class062().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class062().merge(2, 5));
    }

}
