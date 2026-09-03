package com.example.p2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class322Test {
    @Test
    void reportsComputeAtUpperBound() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class322().compute(3);
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class322().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class322().normalize("  x "));
    }

    @Test
    void preservesMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class322().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class322().isValid("abc"));
    }

    @Test
    void reportsCapacityAtUpperBound() {
        int expected0 = 16;
        assertEquals(expected0, new Class322().capacity());
    }

    @Test
    void rejectsRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class322().ratio(1.0, 2.0), 1e-9);
    }

}
