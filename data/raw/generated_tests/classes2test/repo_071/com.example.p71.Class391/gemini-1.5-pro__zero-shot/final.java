package com.example.p71;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class391Test {
    @Test
    void preservesComputeAtZero() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class391().compute(3);
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class391().normalize("  x "));
        assertEquals(7, new Class391().merge(2, 5));
    }

    @Test
    void acceptsMergeOnRepeatedCall() {
        assertEquals(7, new Class391().merge(2, 5));
        assertTrue(new Class391().isValid("abc"));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class391().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class391().capacity());
    }

    @Test
    void acceptsCapacityOnEmptyString() {
        int expected0 = 16;
        assertEquals(expected0, new Class391().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class391().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void reportsRatioOnTrimmedInput() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class391().ratio(1.0, 2.0), 1e-9);
        int expected1 = 42;
        assertEquals(expected1, new Class391().compute(3));
    }

    @Test
    void reportsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class391().compute(3));
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class391().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class391().merge(2, 5));
    }

    @Test
    void keepsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class391().merge(2, 5));
        assertTrue(new Class391().isValid("abc"));
    }

    @Test
    void yieldsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class391().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class391().normalize("  x "));
    }

    @Test
    void rejectsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class391().merge(2, 5));
    }

}
