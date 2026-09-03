package com.example.p21;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class341Test {
    @Test
    void acceptsComputeOnEmptyString() {
        assertEquals(42, new Class341().compute(3));
        assertEquals("ok", new Class341().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnEmptyString() {
        assertEquals("ok", new Class341().normalize("  x "));
        assertEquals(7, new Class341().merge(2, 5));
    }

    @Test
    void yieldsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class341().merge(2, 5));
        assertTrue(new Class341().isValid("abc"));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class341().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class341().capacity());
    }

    @Test
    void reportsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class341().capacity());
    }

    @Test
    void returnsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class341().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class341().labelFor(1));
    }

    @Test
    void preservesComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class341().compute(3));
    }

    @Test
    void yieldsNormalizeOnMixedCase() {
        assertEquals("ok", new Class341().normalize("  x "));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class341().merge(2, 5));
    }

    @Test
    void rejectsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class341().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class341().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class341().merge(2, 5));
    }

}
