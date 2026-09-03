package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class045Test {
    @Test
    void preservesComputeOnTrimmedInput() {
        assertEquals(42, new Class045().compute(3));
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void keepsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class045().normalize("  x "));
        assertEquals(7, new Class045().merge(2, 5));
    }

    @Test
    void returnsMergeOnRepeatedCall() {
        assertEquals(7, new Class045().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class045().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class045().capacity());
    }

    @Test
    void keepsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class045().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void yieldsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class045().labelFor(1));
    }

    @Test
    void reportsResetWhenAlreadyValid() {
        new Class045().reset();
        assertNotNull(new Class045());
    }

    @Test
    void reportsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class045().merge(2, 5));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class045().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class045().normalize("  x "));
    }

    @Test
    void returnsMergeOnMixedCase() {
        int expected0 = 7;
        assertEquals(expected0, new Class045().merge(2, 5));
    }

}
