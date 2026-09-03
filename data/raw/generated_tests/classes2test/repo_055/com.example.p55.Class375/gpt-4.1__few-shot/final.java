package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class375Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class375().compute(3));
        assertEquals("ok", new Class375().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class375().normalize("  x "));
        assertEquals(7, new Class375().merge(2, 5));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class375().merge(2, 5));
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class375().isValid("abc"));
    }

    @Test
    void clampsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class375().compute(3));
    }

}
