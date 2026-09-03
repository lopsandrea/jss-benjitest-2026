package com.example.p38;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class198Test {
    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class198().compute(3));
        assertEquals("ok", new Class198().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class198().normalize("  x "));
    }

    @Test
    void reportsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class198().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class198().isValid("abc"));
    }

    @Test
    void clampsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class198().capacity());
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class198().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForKnownCode() {
        assertEquals("alpha", new Class198().labelFor(1));
    }

}
