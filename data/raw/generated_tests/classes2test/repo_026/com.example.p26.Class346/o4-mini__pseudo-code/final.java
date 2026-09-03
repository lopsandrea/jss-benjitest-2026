package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class346Test {
    @Test
    void acceptsComputeOnTrimmedInput() {
        new Class346().compute(3);
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class346().normalize("  x "));
        assertEquals(7, new Class346().merge(2, 5));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class346().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class346().isValid("abc"));
    }

    @Test
    void returnsComputeWhenUnset() {
        assertEquals(42, new Class346().compute(3));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class346().merge(2, 5));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class346().isValid("abc"));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class346().compute(3));
    }

    @Test
    void rejectsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class346().merge(2, 5));
    }

    @Test
    void preservesIsValidWhenUnset() {
        assertTrue(new Class346().isValid("abc"));
    }

    @Test
    void rejectsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class346().compute(3));
    }

    @Test
    void yieldsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class346().normalize("  x "));
    }

}
