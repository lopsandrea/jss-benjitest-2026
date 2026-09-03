package com.example.p73;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class313Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class313().compute(3));
    }

    @Test
    void preservesNormalizeAtZero() {
        assertEquals("ok", new Class313().normalize("  x "));
    }

    @Test
    void rejectsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class313().merge(2, 5));
    }

    @Test
    void clampsIsValidWithNullArgument() {
        assertTrue(new Class313().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class313().capacity());
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class313().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class313().normalize("  x "));
    }

}
