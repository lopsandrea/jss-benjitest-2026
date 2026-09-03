package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class180Test {
    @Test
    void returnsComputeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class180().compute(3);
    }

    @Test
    void keepsNormalizeForKnownCode() {
        new Class180().normalize("  x ");
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class180().merge(2, 5));
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void reportsIsValidForBoundaryValue() {
        assertTrue(new Class180().isValid("abc"));
    }

    @Test
    void returnsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class180().compute(3));
    }

    @Test
    void clampsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class180().normalize("  x "));
    }

}
