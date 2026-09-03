package com.example.p63;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class143Test {
    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class143().compute(3));
        assertEquals("ok", new Class143().normalize("  x "));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class143().normalize("  x "));
        assertEquals(7, new Class143().merge(2, 5));
    }

    @Test
    void reportsMergeOnRepeatedCall() {
        assertEquals(7, new Class143().merge(2, 5));
        assertTrue(new Class143().isValid("abc"));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class143().isValid("abc"));
        assertEquals(16, new Class143().capacity());
    }

    @Test
    void returnsCapacityOnEmptyString() {
        assertEquals(16, new Class143().capacity());
    }

    @Test
    void acceptsRatioForKnownCode() {
        assertEquals(0.5, new Class143().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForAtZero() {
        assertEquals("alpha", new Class143().labelFor(1));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class143().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class143().normalize("  x "));
    }

}
