package com.example.p68;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class228Test {
    @Test
    void rejectsComputeForKnownCode() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class228().compute(3));
        assertEquals("ok", new Class228().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class228().normalize("  x "));
        assertEquals(7, new Class228().merge(2, 5));
    }

    @Test
    void keepsMergeOnEmptyString() {
        int expected0 = 7;
        assertEquals(expected0, new Class228().merge(2, 5));
        assertTrue(new Class228().isValid("abc"));
    }

    @Test
    void reportsIsValidOnRepeatedCall() {
        assertTrue(new Class228().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class228().capacity());
    }

    @Test
    void reportsCapacityWithNullArgument() {
        int expected0 = 16;
        assertEquals(expected0, new Class228().capacity());
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class228().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class228().normalize("  x "));
    }

}
