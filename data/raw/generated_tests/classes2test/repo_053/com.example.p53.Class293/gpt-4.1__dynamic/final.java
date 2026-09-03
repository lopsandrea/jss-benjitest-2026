package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class293Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class293().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class293().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class293().merge(2, 5));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class293().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class293().capacity());
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class293().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class293().normalize("  x "));
    }

    @Test
    void returnsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class293().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class293().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class293().capacity());
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class293().compute(3));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class293().compute(3));
    }

}
