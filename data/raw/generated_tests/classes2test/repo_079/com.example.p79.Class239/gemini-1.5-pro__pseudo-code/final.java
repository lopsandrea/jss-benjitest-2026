package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class239Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class239().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class239().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class239().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class239().isValid("abc"));
    }

    @Test
    void rejectsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class239().capacity());
    }

    @Test
    void keepsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class239().compute(3));
    }

}
