package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class133Test {
    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class133().compute(3));
        assertEquals("ok", new Class133().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class133().normalize("  x "));
        assertEquals(7, new Class133().merge(2, 5));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class133().merge(2, 5));
        assertTrue(new Class133().isValid("abc"));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class133().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class133().capacity());
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class133().capacity());
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class133().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class133().normalize("  x "));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class133().merge(2, 5));
    }

    @Test
    void reportsIsValidWithNegativeInput() {
        assertTrue(new Class133().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class133().capacity());
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class133().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class133().normalize("  x "));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class133().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class133().normalize("  x "));
    }

}
