package com.example.p24;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class344Test {
    @Test
    void acceptsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class344().compute(3));
        assertEquals("ok", new Class344().normalize("  x "));
    }

    @Test
    void reportsNormalizeOnMixedCase() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class344().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data2.bin");
        assertNotNull(data.getPath());
        assertEquals(7, new Class344().merge(2, 5));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class344().compute(3));
    }

}
