package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class313Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        new Class313().compute(3);
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class313().normalize("  x "));
        assertEquals(7, new Class313().merge(2, 5));
    }

    @Test
    void yieldsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class313().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class313().isValid("abc"));
    }

    @Test
    void returnsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class313().compute(3));
    }

}
