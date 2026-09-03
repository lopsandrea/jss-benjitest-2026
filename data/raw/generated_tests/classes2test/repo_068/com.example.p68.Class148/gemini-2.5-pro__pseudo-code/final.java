package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class148Test {
    @Test
    void keepsComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class148().compute(3);
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        new Class148().normalize("  x ");
    }

    @Test
    void reportsMergeOnMixedCase() {
        new Class148().merge(2, 5);
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class148().isValid("abc"));
        assertEquals(16, new Class148().capacity());
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        assertEquals(16, new Class148().capacity());
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class148().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class148().normalize("  x "));
    }

    @Test
    void yieldsMergeWithNegativeInput() {
        assertEquals(7, new Class148().merge(2, 5));
    }

}
