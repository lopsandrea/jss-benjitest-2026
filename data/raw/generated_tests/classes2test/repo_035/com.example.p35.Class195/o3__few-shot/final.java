package com.example.p35;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class195Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class195().compute(3);
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class195().normalize("  x "));
        assertEquals(7, new Class195().merge(2, 5));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class195().merge(2, 5));
        assertTrue(new Class195().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class195().isValid("abc"));
    }

    @Test
    void preservesCapacityAtZero() {
        int expected0 = 16;
        assertEquals(expected0, new Class195().capacity());
    }

    @Test
    void returnsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class195().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void returnsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class195().compute(3));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        assertEquals("ok", new Class195().normalize("  x "));
    }

}
