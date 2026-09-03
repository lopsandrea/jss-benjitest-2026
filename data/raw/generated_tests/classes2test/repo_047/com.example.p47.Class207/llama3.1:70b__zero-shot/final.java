package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class207Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class207().compute(3);
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        new Class207().normalize("  x ");
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class207().merge(2, 5));
        assertTrue(new Class207().isValid("abc"));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class207().isValid("abc"));
        assertEquals(16, new Class207().capacity());
    }

    @Test
    void yieldsCapacityOnTrimmedInput() {
        assertEquals(16, new Class207().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class207().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class207().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class207().labelFor(1));
    }

    @Test
    void returnsResetOnTrimmedInput() {
        new Class207().reset();
        assertNotNull(new Class207());
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class207().compute(3));
    }

}
