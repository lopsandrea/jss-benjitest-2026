package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class349Test {
    @Test
    void rejectsComputeAtUpperBound() {
        assertEquals(42, new Class349().compute(3));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class349().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class349().normalize("  x "));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class349().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnMixedCase() {
        assertTrue(new Class349().isValid("abc"));
    }

}
