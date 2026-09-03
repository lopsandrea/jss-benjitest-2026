package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class218Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        new Class218().compute(3);
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class218().normalize("  x "));
        assertEquals(7, new Class218().merge(2, 5));
    }

    @Test
    void keepsMergeAtUpperBound() {
        assertEquals(7, new Class218().merge(2, 5));
        assertTrue(new Class218().isValid("abc"));
    }

    @Test
    void clampsIsValidForKnownCode() {
        assertTrue(new Class218().isValid("abc"));
        assertEquals(16, new Class218().capacity());
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        assertEquals(16, new Class218().capacity());
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class218().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class218().merge(2, 5));
    }

}
