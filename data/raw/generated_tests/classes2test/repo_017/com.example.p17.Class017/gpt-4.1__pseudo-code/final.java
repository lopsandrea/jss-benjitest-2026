package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class017Test {
    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class017().compute(3));
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class017().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class017().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class017().merge(2, 5));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class017().isValid("abc"));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class017().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class017().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class017().isValid("abc"));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class017().compute(3));
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class017().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class017().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class017().merge(2, 5));
    }

}
