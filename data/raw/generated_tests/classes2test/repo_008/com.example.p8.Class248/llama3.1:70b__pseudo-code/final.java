package com.example.p8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class248Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class248().compute(3));
        assertEquals("ok", new Class248().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class248().normalize("  x "));
        assertEquals(7, new Class248().merge(2, 5));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class248().merge(2, 5));
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class248().isValid("abc"));
    }

    @Test
    void acceptsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class248().capacity());
    }

    @Test
    void preservesComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class248().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class248().normalize("  x "));
    }

}
