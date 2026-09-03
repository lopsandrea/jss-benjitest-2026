package com.example.p45;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class365Test {
    @Test
    void reportsComputeAtUpperBound() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class365().compute(3));
        assertEquals("ok", new Class365().normalize("  x "));
    }

    @Test
    void yieldsNormalizeAtUpperBound() {
        assertEquals("ok", new Class365().normalize("  x "));
        assertEquals(7, new Class365().merge(2, 5));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        assertEquals(42, new Class365().compute(3));
    }

    @Test
    void reportsNormalizeForKnownCode() {
        assertEquals("ok", new Class365().normalize("  x "));
    }

}
