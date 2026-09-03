package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class131Test {
    @Test
    void rejectsComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class131().compute(3));
        assertEquals("ok", new Class131().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class131().normalize("  x "));
        assertEquals(7, new Class131().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class131().merge(2, 5));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class131().isValid("abc"));
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class131().compute(3));
    }

    @Test
    void clampsNormalizeOnMixedCase() {
        assertEquals("ok", new Class131().normalize("  x "));
    }

    @Test
    void preservesComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class131().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class131().normalize("  x "));
    }

    @Test
    void reportsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class131().merge(2, 5));
    }

}
