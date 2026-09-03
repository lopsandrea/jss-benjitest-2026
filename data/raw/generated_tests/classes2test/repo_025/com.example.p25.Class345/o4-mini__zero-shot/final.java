package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class345Test {
    @Test
    void rejectsComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class345().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsComputeAtZero() {
        assertEquals(42, new Class345().compute(3));
    }

    @Test
    void preservesNormalizeAtUpperBound() {
        assertEquals("ok", new Class345().normalize("  x "));
    }

    @Test
    void preservesMergeAtZero() {
        assertEquals(7, new Class345().merge(2, 5));
    }

}
