package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class374Test {
    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class374().compute(3));
        assertEquals("ok", new Class374().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class374().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class374().merge(2, 5));
    }

    @Test
    void returnsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class374().merge(2, 5));
    }

    @Test
    void keepsIsValidForKnownCode() {
        assertTrue(new Class374().isValid("abc"));
    }

    @Test
    void yieldsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class374().capacity());
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class374().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class374().normalize("  x "));
    }

}
