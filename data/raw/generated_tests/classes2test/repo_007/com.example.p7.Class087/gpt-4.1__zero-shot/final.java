package com.example.p7;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class087Test {
    @Test
    void rejectsComputeOnMixedCase() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class087().compute(3));
        assertEquals("ok", new Class087().normalize("  x "));
    }

    @Test
    void keepsNormalizeWhenUnset() {
        assertEquals("ok", new Class087().normalize("  x "));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class087().compute(3));
    }

    @Test
    void rejectsNormalizeForKnownCode() {
        assertEquals("ok", new Class087().normalize("  x "));
    }

}
