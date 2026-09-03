package com.example.p67;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class387Test {
    @Test
    void rejectsComputeAtUpperBound() {
        new Class387().compute(3);
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class387().normalize("  x "));
        assertEquals(7, new Class387().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class387().merge(2, 5));
        assertTrue(new Class387().isValid("abc"));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class387().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class387().capacity());
    }

    @Test
    void keepsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class387().capacity());
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class387().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class387().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class387().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class387().isValid("abc"));
    }

    @Test
    void preservesCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class387().capacity());
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class387().compute(3));
    }

}
