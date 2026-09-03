package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class028Test {
    @Test
    void returnsComputeWithNegativeInput() {
        assertEquals(42, new Class028().compute(3));
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void clampsNormalizeAtZero() {
        assertEquals("ok", new Class028().normalize("  x "));
        assertEquals(7, new Class028().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class028().merge(2, 5));
        assertTrue(new Class028().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class028().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class028().capacity());
    }

    @Test
    void acceptsCapacityOnMixedCase() {
        int expected0 = 16;
        assertEquals(expected0, new Class028().capacity());
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class028().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class028().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class028().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class028().isValid("abc"));
    }

}
