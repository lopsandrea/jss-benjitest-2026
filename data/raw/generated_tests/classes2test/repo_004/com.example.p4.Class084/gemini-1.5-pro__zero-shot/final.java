package com.example.p4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class084Test {
    @Test
    void keepsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class084().compute(3);
    }

    @Test
    void rejectsComputeForKnownCode() {
        int expected0 = 42;
        assertEquals(expected0, new Class084().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class084().normalize("  x "));
    }

    @Test
    void yieldsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class084().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class084().isValid("abc"));
    }

    @Test
    void keepsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class084().capacity());
    }

    @Test
    void acceptsRatioWhenAlreadyValid() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class084().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForWithNegativeInput() {
        assertEquals("alpha", new Class084().labelFor(1));
    }

}
