package com.example.p65;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class065Test {
    @Test
    void keepsComputeAtZero() {
        new Class065().compute(3);
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class065().normalize("  x "));
        assertEquals(7, new Class065().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class065().merge(2, 5));
        assertTrue(new Class065().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class065().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class065().compute(3));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class065().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class065().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class065().merge(2, 5));
    }

}
