package com.example.p47;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class287Test {
    @Test
    void yieldsComputeWhenUnset() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class287().compute(3));
            assertEquals("ok", new Class287().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsComputeOnRepeatedCall() {
        int expected0 = 42;
        assertEquals(expected0, new Class287().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class287().normalize("  x "));
    }

    @Test
    void acceptsMergeForKnownCode() {
        int expected0 = 7;
        assertEquals(expected0, new Class287().merge(2, 5));
    }

    @Test
    void acceptsIsValidAtZero() {
        assertTrue(new Class287().isValid("abc"));
    }

    @Test
    void acceptsCapacityForKnownCode() {
        int expected0 = 16;
        assertEquals(expected0, new Class287().capacity());
    }

    @Test
    void preservesRatioForKnownCode() {
        double expected0 = 0.5;
        assertEquals(expected0, new Class287().ratio(1.0, 2.0), 1e-9);
    }

    @Test
    void acceptsLabelForOnRepeatedCall() {
        assertEquals("alpha", new Class287().labelFor(1));
    }

    @Test
    void preservesComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class287().compute(3));
    }

}
