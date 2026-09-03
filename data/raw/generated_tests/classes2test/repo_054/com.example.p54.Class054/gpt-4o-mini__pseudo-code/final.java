package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class054Test {
    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class054().compute(3));
        assertEquals("ok", new Class054().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class054().normalize("  x "));
        assertEquals(7, new Class054().merge(2, 5));
    }

    @Test
    void returnsMergeWhenUnset() {
        assertEquals(7, new Class054().merge(2, 5));
        assertTrue(new Class054().isValid("abc"));
    }

    @Test
    void returnsIsValidWhenUnset() {
        assertTrue(new Class054().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class054().capacity());
    }

    @Test
    void clampsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class054().capacity());
        int expected1 = 42;
        assertEquals(expected1, new Class054().compute(3));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class054().compute(3));
        assertEquals("ok", new Class054().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class054().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class054().merge(2, 5));
    }

    @Test
    void clampsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class054().compute(3));
    }

    @Test
    void keepsNormalizeAtUpperBound() {
        assertEquals("ok", new Class054().normalize("  x "));
    }

    @Test
    void clampsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class054().merge(2, 5));
    }

}
