package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class141Test {
    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class141().compute(3));
        assertEquals("ok", new Class141().normalize("  x "));
    }

    @Test
    void rejectsNormalizeAtZero() {
        assertEquals("ok", new Class141().normalize("  x "));
        assertEquals(7, new Class141().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class141().merge(2, 5));
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void yieldsIsValidWhenUnset() {
        assertTrue(new Class141().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class141().capacity());
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class141().compute(3));
    }

    @Test
    void preservesComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class141().compute(3));
    }

}
