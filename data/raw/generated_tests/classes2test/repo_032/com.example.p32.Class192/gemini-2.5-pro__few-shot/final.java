package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class192Test {
    @Test
    void preservesComputeWhenUnset() {
        new Class192().compute(3);
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class192().normalize("  x "));
        assertEquals(7, new Class192().merge(2, 5));
    }

    @Test
    void acceptsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class192().merge(2, 5));
    }

    @Test
    void clampsIsValidAtZero() {
        assertTrue(new Class192().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class192().capacity());
    }

}
