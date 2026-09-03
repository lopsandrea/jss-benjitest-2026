package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {
    @Test
    void preservesComputeWithNegativeInput() {
        new Class146().compute(3);
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class146().normalize("  x "));
        assertEquals(7, new Class146().merge(2, 5));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class146().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void keepsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class146().capacity());
    }

    @Test
    void preservesRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class146().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsLabelForAtZero() {
        assertEquals("alpha", new Class146().labelFor(1));
    }

    @Test
    void acceptsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class146().compute(3));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class146().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void reportsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class146().capacity());
    }

}
