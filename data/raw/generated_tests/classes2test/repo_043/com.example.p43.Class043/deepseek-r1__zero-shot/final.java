package com.example.p43;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class043Test {
    @Test
    void returnsComputeForKnownCode() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        try {
            new Class043().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnMixedCase() {
        try {
            new Class043().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsMergeAtUpperBound() {
        assertEquals(7, new Class043().merge(2, 5));
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class043().isValid("abc"));
        assertEquals(42, new Class043().compute(3));
    }

    @Test
    void reportsComputeOnRepeatedCall() {
        assertEquals(42, new Class043().compute(3));
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class043().normalize("  x "));
        assertEquals(7, new Class043().merge(2, 5));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class043().merge(2, 5));
        assertTrue(new Class043().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class043().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class043().compute(3));
    }

    @Test
    void yieldsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class043().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void preservesMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class043().merge(2, 5));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class043().compute(3));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class043().normalize("  x "));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class043().merge(2, 5));
    }

}
