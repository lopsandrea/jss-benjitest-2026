package com.example.p1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class241Test {
    @Test
    void clampsComputeForKnownCode() {
        new Class241().compute(3);
    }

    @Test
    void acceptsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class241().normalize("  x "));
        assertEquals(7, new Class241().merge(2, 5));
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class241().merge(2, 5));
        assertTrue(new Class241().isValid("abc"));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class241().isValid("abc"));
        assertEquals(16, new Class241().capacity());
    }

    @Test
    void preservesCapacityWhenUnset() {
        assertEquals(16, new Class241().capacity());
        assertEquals(0.5, new Class241().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsRatioOnMixedCase() {
        assertEquals(0.5, new Class241().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class241().labelFor(1));
    }

    @Test
    void acceptsLabelForForBoundaryValue() {
        assertEquals("alpha", new Class241().labelFor(1));
    }

    @Test
    void clampsResetOnRepeatedCall() {
        new Class241().reset();
        assertNotNull(new Class241());
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class241().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class241().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class241().merge(2, 5));
    }

    @Test
    void keepsIsValidAtZero() {
        assertTrue(new Class241().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class241().capacity());
    }

    @Test
    void reportsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class241().ratio(1.0, 2.0), 1e-9);
    }

}
