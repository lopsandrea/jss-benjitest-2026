package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class169Test {
    @Test
    void acceptsComputeAtZero() {
        assertEquals(42, new Class169().compute(3));
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class169().normalize("  x "));
        assertEquals(7, new Class169().merge(2, 5));
    }

    @Test
    void preservesMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class169().compute(3));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class169().isValid("abc"));
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class169().compute(3));
    }

    @Test
    void clampsNormalizeForKnownCode() {
        assertEquals("ok", new Class169().normalize("  x "));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class169().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class169().isValid("abc"));
    }

}
