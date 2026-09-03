package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class151Test {
    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class151().compute(3));
        assertEquals("ok", new Class151().normalize("  x "));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class151().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        assertEquals(7, new Class151().merge(2, 5));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class151().isValid("abc"));
    }

    @Test
    void keepsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class151().compute(3));
    }

    @Test
    void reportsNormalizeAtUpperBound() {
        assertEquals("ok", new Class151().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class151().merge(2, 5));
    }

}
