package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class091Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class091().compute(3));
        assertEquals("ok", new Class091().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class091().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class091().merge(2, 5));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class091().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class091().isValid("abc"));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class091().compute(3));
    }

}
