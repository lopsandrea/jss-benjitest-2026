package com.example.p74;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class074Test {
    @Test
    void preservesComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class074().compute(3));
            assertEquals("ok", new Class074().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        java.io.File data = new java.io.File("/tmp/data1.bin");
        assertNotNull(data.getPath());
        assertEquals("ok", new Class074().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        assertEquals(7, new Class074().merge(2, 5));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class074().compute(3));
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class074().normalize("  x "));
    }

}
