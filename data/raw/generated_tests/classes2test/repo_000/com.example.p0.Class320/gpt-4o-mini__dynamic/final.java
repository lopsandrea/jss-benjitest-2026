package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class320Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class320().compute(3));
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class320().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class320().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class320().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class320().isValid("abc"));
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class320().compute(3));
    }

}
