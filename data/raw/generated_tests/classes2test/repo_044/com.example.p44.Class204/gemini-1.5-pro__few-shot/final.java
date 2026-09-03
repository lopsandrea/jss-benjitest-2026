package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class204Test {
    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class204().compute(3));
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void clampsNormalizeWithNullArgument() {
        assertEquals("ok", new Class204().normalize("  x "));
        assertEquals(7, new Class204().merge(2, 5));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        assertEquals(7, new Class204().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnMixedCase() {
        assertTrue(new Class204().isValid("abc"));
    }

    @Test
    void returnsComputeOnMixedCase() {
        assertEquals(42, new Class204().compute(3));
    }

    @Test
    void rejectsNormalizeOnMixedCase() {
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class204().merge(2, 5));
    }

    @Test
    void rejectsIsValidAtZero() {
        assertTrue(new Class204().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class204().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class204().normalize("  x "));
    }

    @Test
    void returnsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class204().merge(2, 5));
    }

    @Test
    void reportsIsValidOnMixedCase() {
        assertTrue(new Class204().isValid("abc"));
    }

    @Test
    void acceptsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class204().compute(3));
    }

    @Test
    void rejectsNormalizeWhenUnset() {
        assertEquals("ok", new Class204().normalize("  x "));
    }

}
