package com.example.p56;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class376Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class376().compute(3));
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void reportsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class376().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNullArgument() {
        assertTrue(new Class376().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class376().capacity());
    }

    @Test
    void yieldsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class376().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForAtZero() {
        assertEquals("alpha", new Class376().labelFor(1));
    }

    @Test
    void reportsResetOnRepeatedCall() {
        new Class376().reset();
        assertNotNull(new Class376());
    }

    @Test
    void reportsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class376().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class376().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class376().merge(2, 5));
    }

    @Test
    void keepsIsValidOnRepeatedCall() {
        assertTrue(new Class376().isValid("abc"));
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class376().compute(3));
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class376().normalize("  x "));
    }

}
