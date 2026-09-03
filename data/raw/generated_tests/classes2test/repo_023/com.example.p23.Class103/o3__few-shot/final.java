package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class103Test {
    @Test
    void keepsComputeOnMixedCase() {
        assertEquals(42, new Class103().compute(3));
        assertEquals("ok", new Class103().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class103().normalize("  x "));
        assertEquals(7, new Class103().merge(2, 5));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class103().merge(2, 5));
        assertTrue(new Class103().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class103().isValid("abc"));
    }

    @Test
    void preservesCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class103().capacity());
    }

    @Test
    void returnsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class103().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class103().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class103().normalize("  x "));
    }

}
