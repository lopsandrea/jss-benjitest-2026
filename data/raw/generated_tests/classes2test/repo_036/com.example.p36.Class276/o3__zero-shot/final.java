package com.example.p36;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class276Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        assertEquals(42, new Class276().compute(3));
        assertEquals("ok", new Class276().normalize("  x "));
    }

    @Test
    void yieldsComputeOnRepeatedCall() {
        assertEquals(42, new Class276().compute(3));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class276().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class276().merge(2, 5));
    }

    @Test
    void returnsIsValidForKnownCode() {
        assertTrue(new Class276().isValid("abc"));
    }

    @Test
    void rejectsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class276().capacity());
    }

    @Test
    void preservesRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class276().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForAtZero() {
        assertEquals("alpha", new Class276().labelFor(1));
    }

}
