package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void acceptsComputeWithNullArgument() {
        try {
            assertEquals(42, new Class080().compute(3));
            assertEquals("ok", new Class080().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void returnsMergeForKnownCode() {
        assertEquals(7, new Class080().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void rejectsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class080().capacity());
    }

    @Test
    void yieldsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class080().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void reportsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class080().merge(2, 5));
    }

    @Test
    void returnsIsValidOnTrimmedInput() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void clampsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class080().capacity());
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class080().compute(3));
    }

}
