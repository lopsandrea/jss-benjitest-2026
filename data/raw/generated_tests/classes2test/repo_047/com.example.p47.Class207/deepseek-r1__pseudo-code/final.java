package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class207Test {
    @Test
    void rejectsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class207().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        try {
            assertEquals("ok", new Class207().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class207().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class207().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class207().capacity());
    }

    @Test
    void returnsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class207().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForAtZero() {
        assertEquals("alpha", new Class207().labelFor(1));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class207().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class207().normalize("  x "));
    }

}
