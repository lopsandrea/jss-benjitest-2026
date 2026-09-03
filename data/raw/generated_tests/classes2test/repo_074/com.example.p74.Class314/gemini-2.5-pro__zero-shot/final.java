package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class314Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        new Class314().compute(3);
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class314().normalize("  x "));
        assertEquals(7, new Class314().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class314().merge(2, 5));
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class314().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class314().capacity());
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class314().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class314().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class314().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class314().isValid("abc"));
    }

    @Test
    void returnsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class314().capacity());
    }

}
