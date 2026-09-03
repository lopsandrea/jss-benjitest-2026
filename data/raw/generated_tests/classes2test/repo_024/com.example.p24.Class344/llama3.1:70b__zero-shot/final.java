package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class344Test {
    @Test
    void preservesComputeOnEmptyString() {
        new Class344().compute(3);
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class344().normalize("  x "));
        assertEquals(7, new Class344().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        assertEquals(7, new Class344().merge(2, 5));
        assertTrue(new Class344().isValid("abc"));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class344().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class344().capacity());
    }

    @Test
    void preservesCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class344().capacity());
    }

}
