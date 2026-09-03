package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class101Test {
    @Test
    void clampsComputeAtUpperBound() {
        assertEquals(42, new Class101().compute(3));
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void returnsNormalizeAtUpperBound() {
        assertEquals("ok", new Class101().normalize("  x "));
        assertEquals(7, new Class101().merge(2, 5));
    }

    @Test
    void returnsMergeWhenUnset() {
        assertEquals(7, new Class101().merge(2, 5));
        assertTrue(new Class101().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class101().isValid("abc"));
        assertEquals(42, new Class101().compute(3));
    }

    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class101().compute(3));
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class101().normalize("  x "));
        assertEquals(7, new Class101().merge(2, 5));
    }

    @Test
    void yieldsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class101().compute(3));
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class101().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class101().merge(2, 5));
    }

}
