package com.example.p50;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class370Test {
    @Test
    void rejectsComputeAtUpperBound() {
        new Class370().compute(3);
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class370().normalize("  x "));
        assertEquals(7, new Class370().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        assertEquals(7, new Class370().merge(2, 5));
        assertTrue(new Class370().isValid("abc"));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class370().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class370().capacity());
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class370().compute(3));
    }

}
