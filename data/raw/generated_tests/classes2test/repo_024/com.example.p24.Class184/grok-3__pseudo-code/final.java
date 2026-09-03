package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class184Test {
    @Test
    void clampsComputeAtUpperBound() {
        try {
            int expected0 = 42;
            assertEquals(expected0, new Class184().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class184().normalize("  x "));
    }

    @Test
    void preservesMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class184().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtUpperBound() {
        assertTrue(new Class184().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class184().capacity());
    }

    @Test
    void keepsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class184().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class184().labelFor(1));
    }

}
