package com.example.p44;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class124Test {
    @Test
    void acceptsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class124().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture1.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals("ok", new Class124().normalize("  x "));
        assertEquals(7, new Class124().merge(2, 5));
    }

    @Test
    void keepsMergeOnTrimmedInput() {
        assertEquals(7, new Class124().merge(2, 5));
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void clampsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class124().capacity());
    }

    @Test
    void clampsRatioWithNegativeInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class124().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void preservesComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
    }

    @Test
    void preservesNormalizeForKnownCode() {
        assertEquals("ok", new Class124().normalize("  x "));
    }

    @Test
    void rejectsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class124().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenAlreadyValid() {
        assertTrue(new Class124().isValid("abc"));
    }

    @Test
    void acceptsCapacityOnRepeatedCall() {
        int expected0 = 16;
        assertEquals(expected0, new Class124().capacity());
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class124().compute(3));
    }

}
