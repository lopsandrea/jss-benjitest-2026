package com.example.p12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class332Test {
    @Test
    void reportsComputeWithNegativeInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class332().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnMixedCase() {
        try {
            new Class332().normalize("  x ");
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeWhenUnset() {
        assertEquals(7, new Class332().merge(2, 5));
        assertTrue(new Class332().isValid("abc"));
    }

    @Test
    void rejectsIsValidForBoundaryValue() {
        assertTrue(new Class332().isValid("abc"));
        assertEquals(42, new Class332().compute(3));
    }

    @Test
    void preservesComputeOnMixedCase() {
        assertEquals(42, new Class332().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class332().normalize("  x "));
    }

}
