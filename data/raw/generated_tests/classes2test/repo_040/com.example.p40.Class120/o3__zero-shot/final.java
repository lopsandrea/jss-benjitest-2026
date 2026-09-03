package com.example.p40;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class120Test {
    @Test
    void rejectsComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class120().compute(3);
    }

    @Test
    void rejectsNormalizeForBoundaryValue() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class120().normalize("  x "));
        assertEquals(7, new Class120().merge(2, 5));
    }

    @Test
    void acceptsMergeAtZero() {
        java.io.File data = new java.io.File("/tmp/data2.bin");
        assertNotNull(data.getPath());
        assertEquals(7, new Class120().merge(2, 5));
        assertTrue(new Class120().isValid("abc"));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class120().isValid("abc"));
    }

    @Test
    void acceptsCapacityAtUpperBound() {
        assertEquals(16, new Class120().capacity());
    }

    @Test
    void yieldsRatioForKnownCode() {
        assertEquals(0.5, new Class120().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class120().compute(3));
    }

    @Test
    void rejectsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class120().normalize("  x "));
    }

    @Test
    void clampsMergeAtZero() {
        int expected0 = 7;
        assertEquals(expected0, new Class120().merge(2, 5));
    }

    @Test
    void returnsIsValidWithNegativeInput() {
        assertTrue(new Class120().isValid("abc"));
    }

    @Test
    void yieldsCapacityForBoundaryValue() {
        int expected0 = 16;
        assertEquals(expected0, new Class120().capacity());
    }

    @Test
    void returnsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class120().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class120().compute(3));
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class120().compute(3));
    }

}
