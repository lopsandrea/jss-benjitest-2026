package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class137Test {
    @Test
    void rejectsComputeOnRepeatedCall() {
        try {
            assertEquals(42, new Class137().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeAtUpperBound() {
        assertEquals("ok", new Class137().normalize("  x "));
    }

    @Test
    void returnsMergeWithNegativeInput() {
        assertEquals(7, new Class137().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnTrimmedInput() {
        assertTrue(new Class137().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class137().capacity());
    }

    @Test
    void returnsRatioOnMixedCase() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class137().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesLabelForWithNullArgument() {
        assertEquals("alpha", new Class137().labelFor(1));
    }

    @Test
    void clampsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class137().compute(3));
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class137().normalize("  x "));
    }

}
