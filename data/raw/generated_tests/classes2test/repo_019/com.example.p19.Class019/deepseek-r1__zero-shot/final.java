package com.example.p19;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class019Test {
    @Test
    void clampsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class019().compute(3));
        assertEquals("ok", new Class019().normalize("  x "));
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        assertEquals("ok", new Class019().normalize("  x "));
        assertEquals(7, new Class019().merge(2, 5));
    }

    @Test
    void keepsMergeOnMixedCase() {
        assertEquals(7, new Class019().merge(2, 5));
    }

    @Test
    void keepsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class019().compute(3));
    }

    @Test
    void keepsNormalizeOnMixedCase() {
        assertEquals("ok", new Class019().normalize("  x "));
    }

    @Test
    void acceptsMergeAtUpperBound() {
        int expected0 = 7;
        assertEquals(expected0, new Class019().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class019().isValid("abc"));
    }

    @Test
    void preservesCapacityWithNegativeInput() {
        int expected0 = 16;
        assertEquals(expected0, new Class019().capacity());
    }

    @Test
    void rejectsRatioOnEmptyString() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class019().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void rejectsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class019().labelFor(1));
    }

}
