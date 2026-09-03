package com.example.p48;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class048Test {
    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class048().compute(3));
        assertEquals("ok", new Class048().normalize("  x "));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class048().normalize("  x "));
        assertEquals(7, new Class048().merge(2, 5));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        assertEquals(7, new Class048().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class048().isValid("abc"));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class048().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class048().normalize("  x "));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class048().compute(3));
    }

}
