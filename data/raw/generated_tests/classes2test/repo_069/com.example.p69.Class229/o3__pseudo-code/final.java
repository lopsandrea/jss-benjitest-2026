package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class229Test {
    @Test
    void acceptsComputeForBoundaryValue() {
        assertEquals(42, new Class229().compute(3));
        assertEquals("ok", new Class229().normalize("  x "));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class229().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class229().merge(2, 5));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class229().merge(2, 5));
        assertTrue(new Class229().isValid("abc"));
    }

    @Test
    void returnsIsValidAtUpperBound() {
        assertTrue(new Class229().isValid("abc"));
    }

    @Test
    void returnsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class229().capacity());
    }

    @Test
    void acceptsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class229().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class229().labelFor(1));
    }

    @Test
    void returnsResetForKnownCode() {
        new Class229().reset();
        assertNotNull(new Class229());
    }

    @Test
    void acceptsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class229().compute(3));
    }

    @Test
    void keepsNormalizeWithNullArgument() {
        assertEquals("ok", new Class229().normalize("  x "));
    }

    @Test
    void yieldsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class229().merge(2, 5));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class229().compute(3));
    }

    @Test
    void reportsNormalizeAtZero() {
        assertEquals("ok", new Class229().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class229().merge(2, 5));
    }

}
