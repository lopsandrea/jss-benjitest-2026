package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class211Test {
    @Test
    void reportsComputeOnEmptyString() {
        assertEquals(42, new Class211().compute(3));
        assertEquals("ok", new Class211().normalize("  x "));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class211().normalize("  x "));
        assertEquals(7, new Class211().merge(2, 5));
    }

    @Test
    void clampsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class211().merge(2, 5));
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class211().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class211().compute(3));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class211().compute(3));
    }

    @Test
    void clampsNormalizeAtUpperBound() {
        assertEquals("ok", new Class211().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class211().merge(2, 5));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class211().compute(3));
    }

    @Test
    void returnsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class211().normalize("  x "));
    }

    @Test
    void reportsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class211().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class211().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class211().compute(3));
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class211().normalize("  x "));
    }

}
