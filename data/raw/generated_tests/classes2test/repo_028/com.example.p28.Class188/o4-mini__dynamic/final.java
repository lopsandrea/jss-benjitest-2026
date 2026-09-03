package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class188Test {
    @Test
    void acceptsComputeOnMixedCase() {
        assertEquals(42, new Class188().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class188().normalize("  x "));
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class188().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenUnset() {
        assertTrue(new Class188().isValid("abc"));
    }

    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class188().compute(3));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class188().compute(3));
    }

}
