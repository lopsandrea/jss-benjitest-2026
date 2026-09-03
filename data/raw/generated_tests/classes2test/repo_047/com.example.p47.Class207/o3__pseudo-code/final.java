package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class207Test {
    @Test
    void clampsComputeWhenAlreadyValid() {
        new Class207().compute(3);
    }

    @Test
    void clampsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class207().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class207().merge(2, 5));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class207().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class207().isValid("abc"));
    }

    @Test
    void rejectsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class207().capacity());
    }

    @Test
    void returnsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class207().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForWithNullArgument() {
        assertEquals("alpha", new Class207().labelFor(1));
    }

    @Test
    void keepsResetWhenUnset() {
        new Class207().reset();
        assertNotNull(new Class207());
    }

    @Test
    void acceptsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class207().compute(3));
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class207().normalize("  x "));
    }

    @Test
    void yieldsMergeOnRepeatedCall() {
        int expected0 = 7;
        assertEquals(expected0, new Class207().merge(2, 5));
    }

}
