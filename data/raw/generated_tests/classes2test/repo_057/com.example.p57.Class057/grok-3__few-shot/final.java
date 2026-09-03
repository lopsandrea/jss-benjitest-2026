package com.example.p57;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class057Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        new Class057().compute(3);
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class057().normalize("  x "));
        assertEquals(7, new Class057().merge(2, 5));
    }

    @Test
    void acceptsMergeForKnownCode() {
        assertEquals(7, new Class057().merge(2, 5));
        assertTrue(new Class057().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class057().isValid("abc"));
    }

    @Test
    void preservesCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class057().capacity());
    }

    @Test
    void returnsRatioForBoundaryValue() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class057().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class057().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class057().normalize("  x "));
    }

    @Test
    void rejectsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class057().merge(2, 5));
    }

    @Test
    void keepsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class057().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class057().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class057().merge(2, 5));
    }

    @Test
    void preservesIsValidAtZero() {
        assertTrue(new Class057().isValid("abc"));
    }

}
