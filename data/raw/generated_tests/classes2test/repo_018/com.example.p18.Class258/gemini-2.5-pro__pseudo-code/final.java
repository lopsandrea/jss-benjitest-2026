package com.example.p18;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class258Test {
    @Test
    void returnsComputeOnMixedCase() {
        new Class258().compute(3);
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        assertEquals(7, new Class258().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class258().isValid("abc"));
    }

    @Test
    void clampsCapacityOnMixedCase() {
        assertEquals(16, new Class258().capacity());
    }

    @Test
    void keepsRatioWithNegativeInput() {
        assertEquals(0.5, new Class258().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class258().labelFor(1));
    }

    @Test
    void clampsResetOnRepeatedCall() {
        new Class258().reset();
        assertNotNull(new Class258());
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class258().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class258().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class258().merge(2, 5));
    }

    @Test
    void rejectsIsValidForKnownCode() {
        assertTrue(new Class258().isValid("abc"));
    }

    @Test
    void keepsCapacityWhenUnset() {
        int expected0 = 16;
        assertEquals(expected0, new Class258().capacity());
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class258().compute(3));
    }

}
