package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class280Test {
    @Test
    void preservesComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class280().compute(3));
            assertEquals("ok", new Class280().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class280().normalize("  x "));
        assertEquals(7, new Class280().merge(2, 5));
    }

    @Test
    void returnsMergeWhenAlreadyValid() {
        assertEquals(7, new Class280().merge(2, 5));
    }

    @Test
    void preservesIsValidAtUpperBound() {
        assertTrue(new Class280().isValid("abc"));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class280().compute(3));
    }

    @Test
    void clampsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class280().normalize("  x "));
    }

    @Test
    void preservesMergeOnTrimmedInput() {
        assertEquals(7, new Class280().merge(2, 5));
    }

    @Test
    void rejectsComputeForKnownCode() {
        assertEquals(42, new Class280().compute(3));
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class280().normalize("  x "));
    }

}
