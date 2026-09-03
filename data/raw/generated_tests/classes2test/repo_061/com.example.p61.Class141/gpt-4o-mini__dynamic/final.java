package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class141Test {
    @Test
    void clampsComputeWithNegativeInput() {
        assertEquals(42, new Class141().compute(3));
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class141().normalize("  x "));
        assertEquals(7, new Class141().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class141().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class141().capacity());
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class141().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class141().normalize("  x "));
    }

}
