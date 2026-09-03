package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class367Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class367().compute(3));
        assertEquals("ok", new Class367().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class367().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class367().merge(2, 5));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class367().merge(2, 5));
        assertTrue(new Class367().isValid("abc"));
    }

    @Test
    void clampsIsValidWithNegativeInput() {
        assertTrue(new Class367().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class367().capacity());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class367().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class367().normalize("  x "));
    }

}
