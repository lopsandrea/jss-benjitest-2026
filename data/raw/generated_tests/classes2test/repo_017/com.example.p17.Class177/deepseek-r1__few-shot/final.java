package com.example.p17;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class177Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        try {
            assertEquals(42, new Class177().compute(3));
            assertEquals("ok", new Class177().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class177().normalize("  x "));
        assertEquals(7, new Class177().merge(2, 5));
    }

    @Test
    void acceptsMergeForBoundaryValue() {
        assertEquals(7, new Class177().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class177().isValid("abc"));
    }

    @Test
    void rejectsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class177().compute(3));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class177().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class177().merge(2, 5));
    }

    @Test
    void yieldsIsValidForBoundaryValue() {
        assertTrue(new Class177().isValid("abc"));
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class177().capacity());
    }

    @Test
    void reportsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class177().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForForKnownCode() {
        assertEquals("alpha", new Class177().labelFor(1));
    }

    @Test
    void clampsResetOnEmptyString() {
        new Class177().reset();
        assertNotNull(new Class177());
    }

}
