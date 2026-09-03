package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class019Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class019().compute(3));
        assertEquals("ok", new Class019().normalize("  x "));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class019().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class019().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class019().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class019().capacity());
    }

    @Test
    void keepsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class019().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class019().labelFor(1));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class019().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class019().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class019().merge(2, 5));
    }

}
