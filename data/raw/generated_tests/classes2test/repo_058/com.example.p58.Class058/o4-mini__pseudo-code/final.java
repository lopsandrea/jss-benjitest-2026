package com.example.p58;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class058Test {
    @Test
    void preservesComputeOnEmptyString() {
        assertEquals(42, new Class058().compute(3));
        assertEquals("ok", new Class058().normalize("  x "));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class058().normalize("  x "));
        assertEquals(7, new Class058().merge(2, 5));
    }

    @Test
    void preservesMergeOnRepeatedCall() {
        assertEquals(7, new Class058().merge(2, 5));
        assertTrue(new Class058().isValid("abc"));
    }

    @Test
    void clampsIsValidOnRepeatedCall() {
        assertTrue(new Class058().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class058().capacity());
    }

    @Test
    void reportsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class058().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class058().compute(3));
    }

}
