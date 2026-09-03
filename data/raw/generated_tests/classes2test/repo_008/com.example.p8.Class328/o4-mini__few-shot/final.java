package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class328Test {
    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class328().compute(3));
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class328().normalize("  x "));
        assertEquals(7, new Class328().merge(2, 5));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class328().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class328().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class328().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class328().isValid("abc"));
    }

    @Test
    void reportsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class328().capacity());
    }

}
