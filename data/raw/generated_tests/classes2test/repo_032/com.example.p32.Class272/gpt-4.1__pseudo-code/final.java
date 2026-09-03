package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {
    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class272().compute(3));
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class272().normalize("  x "));
        assertEquals(7, new Class272().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
        assertTrue(new Class272().isValid("abc"));
    }

    @Test
    void returnsIsValidOnRepeatedCall() {
        assertTrue(new Class272().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class272().capacity());
    }

    @Test
    void keepsCapacityOnTrimmedInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class272().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class272().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class272().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class272().merge(2, 5));
    }

}
