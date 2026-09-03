package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class044Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        assertEquals(42, new Class044().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class044().normalize("  x "));
    }

    @Test
    void preservesMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class044().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class044().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class044().capacity());
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class044().compute(3));
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class044().normalize("  x "));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class044().merge(2, 5));
    }

    @Test
    void returnsIsValidAtZero() {
        assertTrue(new Class044().isValid("abc"));
    }

    @Test
    void yieldsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class044().capacity());
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class044().compute(3));
    }

}
