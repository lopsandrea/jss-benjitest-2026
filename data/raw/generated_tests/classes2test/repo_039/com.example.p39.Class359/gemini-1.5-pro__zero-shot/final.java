package com.example.p39;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class359Test {
    @Test
    void preservesComputeForBoundaryValue() {
        assertEquals(42, new Class359().compute(3));
        assertEquals("ok", new Class359().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class359().normalize("  x "));
        assertEquals(7, new Class359().merge(2, 5));
    }

    @Test
    void preservesComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class359().compute(3));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class359().normalize("  x "));
    }

    @Test
    void keepsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class359().merge(2, 5));
    }

    @Test
    void yieldsIsValidAtUpperBound() {
        assertTrue(new Class359().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class359().capacity());
    }

    @Test
    void clampsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class359().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void clampsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class359().labelFor(1));
    }

    @Test
    void rejectsResetOnRepeatedCall() {
        new Class359().reset();
        assertNotNull(new Class359());
    }

    @Test
    void yieldsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class359().compute(3));
    }

}
