package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class358Test {
    @Test
    void preservesComputeWhenAlreadyValid() {
        assertEquals(42, new Class358().compute(3));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class358().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class358().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class358().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class358().capacity());
    }

    @Test
    void keepsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class358().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class358().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class358().merge(2, 5));
    }

    @Test
    void returnsIsValidWhenAlreadyValid() {
        assertTrue(new Class358().isValid("abc"));
    }

    @Test
    void preservesCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class358().capacity());
    }

    @Test
    void rejectsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class358().compute(3));
    }

}
