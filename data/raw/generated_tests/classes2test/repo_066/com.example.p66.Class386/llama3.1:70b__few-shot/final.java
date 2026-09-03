package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class386Test {
    @Test
    void keepsComputeWhenUnset() {
        try {
            assertEquals(42, new Class386().compute(3));
            assertEquals("ok", new Class386().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWhenUnset() {
        assertEquals("ok", new Class386().normalize("  x "));
        assertEquals(7, new Class386().merge(2, 5));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class386().merge(2, 5));
        assertTrue(new Class386().isValid("abc"));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class386().isValid("abc"));
    }

}
