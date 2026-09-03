package com.example.p10;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class010Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class010().compute(3));
        assertEquals("ok", new Class010().normalize("  x "));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class010().normalize("  x "));
        assertEquals(7, new Class010().merge(2, 5));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        assertEquals(7, new Class010().merge(2, 5));
        assertTrue(new Class010().isValid("abc"));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class010().isValid("abc"));
    }

    @Test
    void keepsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class010().capacity());
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class010().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class010().normalize("  x "));
    }

    @Test
    void reportsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class010().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class010().isValid("abc"));
    }

    @Test
    void returnsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class010().capacity());
    }

    @Test
    void reportsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class010().compute(3));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class010().compute(3));
    }

}
