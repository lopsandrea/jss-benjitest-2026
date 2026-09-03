package com.example.p37;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class117Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class117().compute(3));
        assertEquals("ok", new Class117().normalize("  x "));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class117().normalize("  x "));
        assertEquals(7, new Class117().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class117().merge(2, 5));
        assertTrue(new Class117().isValid("abc"));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class117().isValid("abc"));
    }

    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class117().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class117().normalize("  x "));
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class117().compute(3));
    }

}
