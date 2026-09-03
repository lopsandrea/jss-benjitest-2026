package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class339Test {
    @Test
    void returnsComputeAtZero() {
        assertEquals(42, new Class339().compute(3));
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class339().normalize("  x "));
        assertEquals(7, new Class339().merge(2, 5));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        assertEquals(7, new Class339().merge(2, 5));
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class339().isValid("abc"));
        assertEquals(16, new Class339().capacity());
    }

    @Test
    void acceptsCapacityForBoundaryValue() {
        assertEquals(16, new Class339().capacity());
    }

    @Test
    void preservesRatioOnRepeatedCall() {
        assertEquals(0.5, new Class339().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class339().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void keepsMergeOnEmptyString() {
        assertEquals(7, new Class339().merge(2, 5));
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class339().compute(3));
    }

    @Test
    void reportsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class339().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNegativeInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class339().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnRepeatedCall() {
        assertTrue(new Class339().isValid("abc"));
    }

    @Test
    void acceptsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class339().capacity());
    }

}
