package com.example.p70;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class390Test {
    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class390().compute(3));
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        assertEquals(42, new Class390().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class390().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class390().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class390().isValid("abc"));
    }

    @Test
    void reportsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class390().capacity());
    }

}
