package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class218Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        new Class218().compute(3);
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class218().normalize("  x "));
        assertEquals(7, new Class218().merge(2, 5));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class218().merge(2, 5));
        assertTrue(new Class218().isValid("abc"));
    }

    @Test
    void keepsComputeWithNegativeInput() {
        assertEquals(42, new Class218().compute(3));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class218().normalize("  x "));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        assertEquals(7, new Class218().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class218().isValid("abc"));
    }

}
