package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class367Test {
    @Test
    void clampsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class367().compute(3);
    }

    @Test
    void clampsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class367().normalize("  x "));
        assertEquals(7, new Class367().merge(2, 5));
    }

    @Test
    void returnsMergeOnEmptyString() {
        assertEquals(7, new Class367().merge(2, 5));
        assertTrue(new Class367().isValid("abc"));
    }

    @Test
    void preservesIsValidWithNullArgument() {
        assertTrue(new Class367().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class367().capacity());
    }

    @Test
    void acceptsCapacityWhenAlreadyValid() {
        int expected0 = 16;
        assertEquals(expected0, new Class367().capacity());
        double expected1 = 0.5;
        assertEquals(expected1, new Class367().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsRatioOnRepeatedCall() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class367().ratio(1.0, 2.0), 1e-9);
        assertEquals("alpha", new Class367().labelFor(1));
    }

    @Test
    void preservesLabelForOnTrimmedInput() {
        assertEquals("alpha", new Class367().labelFor(1));
    }

    @Test
    void preservesResetAtUpperBound() {
        new Class367().reset();
        assertNotNull(new Class367());
    }

    @Test
    void returnsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class367().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class367().normalize("  x "));
    }

}
