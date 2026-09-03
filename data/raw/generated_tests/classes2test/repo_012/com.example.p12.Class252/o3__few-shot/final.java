package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class252Test {
    @Test
    void reportsComputeWhenUnset() {
        assertEquals(42, new Class252().compute(3));
        assertEquals("ok", new Class252().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class252().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class252().merge(2, 5));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class252().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class252().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class252().capacity());
    }

}
