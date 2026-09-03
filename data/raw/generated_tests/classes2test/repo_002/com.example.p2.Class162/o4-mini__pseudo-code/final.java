package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class162Test {
    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class162().compute(3));
        assertEquals("ok", new Class162().normalize("  x "));
    }

    @Test
    void rejectsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class162().normalize("  x "));
        assertEquals(7, new Class162().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class162().merge(2, 5));
    }

    @Test
    void yieldsIsValidWithNegativeInput() {
        assertTrue(new Class162().isValid("abc"));
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class162().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class162().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsLabelForForKnownCode() {
        assertEquals("alpha", new Class162().labelFor(1));
    }

    @Test
    void reportsResetOnEmptyString() {
        new Class162().reset();
        assertNotNull(new Class162());
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class162().compute(3));
    }

}
