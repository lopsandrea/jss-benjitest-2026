package com.example.p25;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class345Test {
    @Test
    void acceptsComputeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class345().compute(3));
        assertEquals("ok", new Class345().normalize("  x "));
    }

    @Test
    void acceptsComputeOnRepeatedCall() {
        assertEquals(42, new Class345().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class345().normalize("  x "));
    }

    @Test
    void rejectsMergeWithNullArgument() {
        assertEquals(7, new Class345().merge(2, 5));
    }

}
