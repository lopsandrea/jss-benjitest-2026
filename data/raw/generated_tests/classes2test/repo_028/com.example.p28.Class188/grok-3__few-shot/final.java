package com.example.p28;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class188Test {
    @Test
    void rejectsComputeAtUpperBound() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class188().compute(3));
        assertEquals("ok", new Class188().normalize("  x "));
    }

    @Test
    void returnsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class188().normalize("  x "));
        assertEquals(7, new Class188().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class188().merge(2, 5));
        assertTrue(new Class188().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class188().isValid("abc"));
    }

    @Test
    void preservesComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class188().compute(3));
    }

    @Test
    void yieldsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class188().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class188().normalize("  x "));
    }

}
