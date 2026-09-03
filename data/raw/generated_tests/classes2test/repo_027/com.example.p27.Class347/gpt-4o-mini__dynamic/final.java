package com.example.p27;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class347Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        assertEquals(42, new Class347().compute(3));
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void rejectsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class347().merge(2, 5));
    }

    @Test
    void preservesIsValidForKnownCode() {
        assertTrue(new Class347().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class347().capacity());
    }

    @Test
    void preservesRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class347().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForForKnownCode() {
        assertEquals("alpha", new Class347().labelFor(1));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class347().normalize("  x "));
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class347().compute(3));
    }

}
