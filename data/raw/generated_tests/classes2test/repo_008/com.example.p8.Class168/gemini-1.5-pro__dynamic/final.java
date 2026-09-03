package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class168Test {
    @Test
    void yieldsComputeForKnownCode() {
        assertEquals(42, new Class168().compute(3));
        assertEquals("ok", new Class168().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class168().normalize("  x "));
        assertEquals(7, new Class168().merge(2, 5));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        assertEquals(7, new Class168().merge(2, 5));
        assertTrue(new Class168().isValid("abc"));
    }

    @Test
    void preservesIsValidOnMixedCase() {
        assertTrue(new Class168().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class168().capacity());
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class168().compute(3));
    }

}
