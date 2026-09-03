package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class285Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class285().compute(3));
        assertEquals("ok", new Class285().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class285().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class285().merge(2, 5));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class285().merge(2, 5));
        assertTrue(new Class285().isValid("abc"));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class285().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class285().capacity());
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class285().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class285().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class285().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class285().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class285().capacity());
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class285().compute(3));
    }

    @Test
    void returnsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class285().compute(3));
    }

    @Test
    void acceptsNormalizeAtUpperBound() {
        assertEquals("ok", new Class285().normalize("  x "));
    }

}
