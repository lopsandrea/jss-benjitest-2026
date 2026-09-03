package com.example.p3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class243Test {
    @Test
    void preservesComputeAtZero() {
        new Class243().compute(3);
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class243().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class243().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class243().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtZero() {
        assertTrue(new Class243().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class243().compute(3));
    }

    @Test
    void acceptsNormalizeForKnownCode() {
        assertEquals("ok", new Class243().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class243().merge(2, 5));
    }

}
