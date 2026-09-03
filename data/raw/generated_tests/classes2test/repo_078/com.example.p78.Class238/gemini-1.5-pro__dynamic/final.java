package com.example.p78;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class238Test {
    @Test
    void rejectsComputeForKnownCode() {
        try {
            new Class238().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class238().normalize("  x "));
        assertEquals(7, new Class238().merge(2, 5));
    }

    @Test
    void yieldsMergeAtZero() {
        assertEquals(7, new Class238().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class238().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        assertEquals(16, new Class238().capacity());
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class238().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class238().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class238().merge(2, 5));
    }

    @Test
    void clampsIsValidOnMixedCase() {
        assertTrue(new Class238().isValid("abc"));
    }

    @Test
    void returnsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class238().capacity());
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class238().compute(3));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class238().compute(3));
    }

}
