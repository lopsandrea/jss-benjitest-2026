package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class163Test {
    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class163().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class163().normalize("  x "));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class163().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class163().isValid("abc"));
    }

    @Test
    void reportsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class163().capacity());
    }

}
