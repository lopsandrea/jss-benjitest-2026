package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void keepsComputeForBoundaryValue() {
        assertEquals(42, new Class294().compute(3));
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class294().normalize("  x "));
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void preservesMergeForKnownCode() {
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class294().capacity());
    }

}
