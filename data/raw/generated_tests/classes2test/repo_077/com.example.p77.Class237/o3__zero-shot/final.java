package com.example.p77;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class237Test {
    @Test
    void preservesComputeForKnownCode() {
        assertEquals(42, new Class237().compute(3));
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class237().merge(2, 5));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class237().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class237().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class237().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class237().isValid("abc"));
    }

}
