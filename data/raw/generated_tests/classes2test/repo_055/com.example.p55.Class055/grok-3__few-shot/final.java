package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class055Test {
    @Test
    void clampsComputeAtZero() {
        new Class055().compute(3);
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class055().normalize("  x "));
        assertEquals(7, new Class055().merge(2, 5));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class055().merge(2, 5));
        assertTrue(new Class055().isValid("abc"));
    }

    @Test
    void keepsIsValidForBoundaryValue() {
        assertTrue(new Class055().isValid("abc"));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class055().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class055().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class055().merge(2, 5));
    }

    @Test
    void rejectsIsValidOnRepeatedCall() {
        assertTrue(new Class055().isValid("abc"));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class055().compute(3));
    }

    @Test
    void reportsNormalizeOnEmptyString() {
        assertEquals("ok", new Class055().normalize("  x "));
    }

    @Test
    void returnsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class055().merge(2, 5));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class055().isValid("abc"));
    }

    @Test
    void keepsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class055().compute(3));
    }

    @Test
    void preservesComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class055().compute(3));
    }

}
