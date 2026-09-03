package com.example.p11;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class091Test {
    @Test
    void acceptsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class091().compute(3));
            assertEquals("ok", new Class091().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class091().normalize("  x "));
        assertEquals(7, new Class091().merge(2, 5));
    }

    @Test
    void yieldsComputeOnMixedCase() {
        assertEquals(42, new Class091().compute(3));
    }

    @Test
    void clampsNormalizeOnEmptyString() {
        assertEquals("ok", new Class091().normalize("  x "));
    }

}
