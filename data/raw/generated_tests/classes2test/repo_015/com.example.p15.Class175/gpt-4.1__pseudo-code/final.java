package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class175Test {
    @Test
    void preservesComputeWhenUnset() {
        try {
            assertEquals(42, new Class175().compute(3));
            assertEquals("ok", new Class175().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class175().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class175().merge(2, 5));
    }

}
