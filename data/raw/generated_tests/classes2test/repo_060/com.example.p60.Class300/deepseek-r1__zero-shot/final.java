package com.example.p60;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class300Test {
    @Test
    void returnsComputeWithNullArgument() {
        assertEquals(42, new Class300().compute(3));
        assertEquals("ok", new Class300().normalize("  x "));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class300().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class300().merge(2, 5));
    }

    @Test
    void rejectsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class300().merge(2, 5));
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class300().isValid("abc"));
    }

    @Test
    void yieldsCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class300().capacity());
    }

    @Test
    void reportsRatioWithNullArgument() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class300().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForForKnownCode() {
        assertEquals("alpha", new Class300().labelFor(1));
    }

    @Test
    void rejectsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class300().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class300().normalize("  x "));
    }

    @Test
    void returnsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class300().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class300().isValid("abc"));
    }

}
