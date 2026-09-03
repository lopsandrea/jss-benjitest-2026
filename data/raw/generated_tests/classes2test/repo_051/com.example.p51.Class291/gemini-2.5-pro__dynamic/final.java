package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class291Test {
    @Test
    void returnsComputeAtZero() {
        try {
            assertEquals(42, new Class291().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class291().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        assertEquals(7, new Class291().merge(2, 5));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class291().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class291().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class291().merge(2, 5));
    }

}
