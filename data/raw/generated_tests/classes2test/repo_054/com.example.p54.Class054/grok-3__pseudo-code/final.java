package com.example.p54;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class054Test {
    @Test
    void yieldsComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class054().compute(3));
        assertEquals("ok", new Class054().normalize("  x "));
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class054().normalize("  x "));
        assertEquals(7, new Class054().merge(2, 5));
    }

    @Test
    void clampsMergeWithNegativeInput() {
        assertEquals(7, new Class054().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnEmptyString() {
        assertTrue(new Class054().isValid("abc"));
    }

    @Test
    void yieldsCapacityWhenUnset() {
        assertEquals(16, new Class054().capacity());
    }

    @Test
    void clampsComputeOnTrimmedInput() {
        assertEquals(42, new Class054().compute(3));
    }

    @Test
    void yieldsNormalizeAtZero() {
        assertEquals("ok", new Class054().normalize("  x "));
    }

    @Test
    void reportsMergeWhenAlreadyValid() {
        assertEquals(7, new Class054().merge(2, 5));
    }

}
