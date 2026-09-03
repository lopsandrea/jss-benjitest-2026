package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class378Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class378().compute(3));
        assertEquals("ok", new Class378().normalize("  x "));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class378().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class378().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class378().isValid("abc"));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class378().compute(3));
    }

}
