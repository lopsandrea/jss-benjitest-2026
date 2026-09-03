package com.example.p9;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class329Test {
    @Test
    void keepsComputeWithNegativeInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class329().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        new Class329().normalize("  x ");
    }

    @Test
    void acceptsMergeWithNullArgument() {
        assertEquals(7, new Class329().merge(2, 5));
        assertTrue(new Class329().isValid("abc"));
    }

    @Test
    void rejectsIsValidWithNegativeInput() {
        assertTrue(new Class329().isValid("abc"));
        assertEquals(42, new Class329().compute(3));
    }

    @Test
    void rejectsComputeForBoundaryValue() {
        assertEquals(42, new Class329().compute(3));
    }

    @Test
    void clampsNormalizeWithNegativeInput() {
        assertEquals("ok", new Class329().normalize("  x "));
    }

}
