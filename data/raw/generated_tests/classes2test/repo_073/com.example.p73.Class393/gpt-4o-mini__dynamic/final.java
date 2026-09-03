package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class393Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class393().compute(3));
        assertEquals("ok", new Class393().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class393().normalize("  x "));
        assertEquals(7, new Class393().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenUnset() {
        assertEquals(7, new Class393().merge(2, 5));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class393().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class393().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class393().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class393().isValid("abc"));
    }

    @Test
    void reportsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class393().capacity());
    }

}
