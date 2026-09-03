package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class294Test {
    @Test
    void keepsComputeOnEmptyString() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class294().compute(3);
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class294().normalize("  x "));
        assertEquals(7, new Class294().merge(2, 5));
    }

    @Test
    void returnsMergeForKnownCode() {
        assertEquals(7, new Class294().merge(2, 5));
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void reportsIsValidOnEmptyString() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void keepsCapacityOnMixedCase() {
        assertEquals(16, new Class294().capacity());
    }

    @Test
    void yieldsRatioForBoundaryValue() {
        assertEquals(0.5, new Class294().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class294().compute(3));
    }

    @Test
    void yieldsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class294().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class294().merge(2, 5));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class294().isValid("abc"));
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class294().capacity());
    }

    @Test
    void clampsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class294().ratio(1.0, 2.0), 1e-9);
    }

}
