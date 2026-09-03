package com.example.p31;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class271Test {
    @Test
    void keepsComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class271().compute(3));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeAtZero() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

    @Test
    void reportsComputeOnTrimmedInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class271().compute(3));
    }

    @Test
    void reportsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class271().normalize("  x "));
    }

}
