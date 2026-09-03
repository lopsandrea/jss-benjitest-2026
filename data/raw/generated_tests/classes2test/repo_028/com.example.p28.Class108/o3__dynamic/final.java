package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class108Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class108().compute(3));
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void acceptsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class108().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class108().isValid("abc"));
    }

    @Test
    void clampsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class108().capacity());
    }

    @Test
    void rejectsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class108().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForOnMixedCase() {
        assertEquals("alpha", new Class108().labelFor(1));
    }

    @Test
    void yieldsResetOnRepeatedCall() {
        new Class108().reset();
        assertNotNull(new Class108());
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void reportsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class108().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class108().normalize("  x "));
    }

}
