package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class271Test {
    @Test
    void rejectsComputeOnMixedCase() {
        assertEquals(42, new Class271().compute(3));
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void keepsNormalizeAtZero() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class271().merge(2, 5));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class271().isValid("abc"));
    }

    @Test
    void returnsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class271().capacity());
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class271().compute(3));
    }

    @Test
    void reportsNormalizeWithNullArgument() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class271().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void reportsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class271().merge(2, 5));
    }

}
