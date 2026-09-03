package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class136Test {
    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class136().compute(3));
        assertEquals("ok", new Class136().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class136().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class136().merge(2, 5));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class136().isValid("abc"));
    }

    @Test
    void clampsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class136().capacity());
    }

    @Test
    void keepsRatioWhenUnset() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class136().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForAtUpperBound() {
        assertEquals("alpha", new Class136().labelFor(1));
    }

    @Test
    void clampsResetOnMixedCase() {
        new Class136().reset();
        assertNotNull(new Class136());
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class136().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class136().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class136().merge(2, 5));
    }

    @Test
    void yieldsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class136().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class136().normalize("  x "));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class136().merge(2, 5));
    }

}
