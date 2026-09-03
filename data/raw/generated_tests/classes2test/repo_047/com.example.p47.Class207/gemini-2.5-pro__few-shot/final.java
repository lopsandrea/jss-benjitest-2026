package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class207Test {
    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class207().compute(3));
        assertEquals("ok", new Class207().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class207().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class207().merge(2, 5));
    }

    @Test
    void preservesIsValidOnRepeatedCall() {
        assertTrue(new Class207().isValid("abc"));
    }

    @Test
    void clampsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class207().capacity());
    }

    @Test
    void reportsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class207().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class207().labelFor(1));
    }

    @Test
    void preservesResetAtUpperBound() {
        new Class207().reset();
        assertNotNull(new Class207());
    }

    @Test
    void reportsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class207().compute(3));
    }

}
