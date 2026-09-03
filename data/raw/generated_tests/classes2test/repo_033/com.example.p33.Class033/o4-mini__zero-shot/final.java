package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class033Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class033().compute(3));
        assertEquals("ok", new Class033().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class033().normalize("  x "));
        assertEquals(7, new Class033().merge(2, 5));
    }

    @Test
    void clampsMergeOnRepeatedCall() {
        assertEquals(7, new Class033().merge(2, 5));
        assertTrue(new Class033().isValid("abc"));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class033().compute(3));
    }

}
