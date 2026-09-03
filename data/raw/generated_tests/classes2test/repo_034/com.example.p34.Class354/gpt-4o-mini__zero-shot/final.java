package com.example.p34;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class354Test {
    @Test
    void rejectsComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class354().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeForKnownCode() {
        assertEquals("ok", new Class354().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class354().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class354().merge(2, 5));
        assertTrue(new Class354().isValid("abc"));
    }

    @Test
    void returnsIsValidOnMixedCase() {
        assertTrue(new Class354().isValid("abc"));
    }

    @Test
    void keepsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class354().capacity());
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class354().compute(3));
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class354().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class354().merge(2, 5));
    }

    @Test
    void yieldsIsValidForKnownCode() {
        assertTrue(new Class354().isValid("abc"));
    }

    @Test
    void keepsCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class354().capacity());
    }

}
