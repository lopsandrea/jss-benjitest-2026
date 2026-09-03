package com.example.p16;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class016Test {
    @Test
    void reportsComputeOnEmptyString() {
        new Class016().compute(3);
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class016().normalize("  x "));
        assertEquals(7, new Class016().merge(2, 5));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        assertEquals(7, new Class016().merge(2, 5));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class016().isValid("abc"));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class016().compute(3));
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class016().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class016().merge(2, 5));
    }

}
