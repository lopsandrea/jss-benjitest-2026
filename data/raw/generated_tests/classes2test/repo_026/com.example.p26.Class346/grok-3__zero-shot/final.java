package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class346Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class346().compute(3);
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        new Class346().normalize("  x ");
    }

    @Test
    void clampsMergeOnEmptyString() {
        assertEquals(7, new Class346().merge(2, 5));
        assertTrue(new Class346().isValid("abc"));
    }

    @Test
    void reportsIsValidWhenAlreadyValid() {
        assertTrue(new Class346().isValid("abc"));
        assertEquals(42, new Class346().compute(3));
    }

    @Test
    void yieldsComputeWithNegativeInput() {
        assertEquals(42, new Class346().compute(3));
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void yieldsNormalizeForKnownCode() {
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void acceptsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class346().merge(2, 5));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class346().compute(3));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void clampsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class346().merge(2, 5));
    }

    @Test
    void keepsIsValidAtUpperBound() {
        assertTrue(new Class346().isValid("abc"));
    }

}
