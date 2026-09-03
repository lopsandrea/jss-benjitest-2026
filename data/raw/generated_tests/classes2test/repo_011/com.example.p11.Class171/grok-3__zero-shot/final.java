package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class171Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class171().compute(3));
        assertEquals("ok", new Class171().normalize("  x "));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class171().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class171().merge(2, 5));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class171().merge(2, 5));
        assertTrue(new Class171().isValid("abc"));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class171().compute(3));
    }

}
