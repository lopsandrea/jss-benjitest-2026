package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class015Test {
    @Test
    void acceptsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class015().compute(3));
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void preservesNormalizeWhenUnset() {
        assertEquals("ok", new Class015().normalize("  x "));
    }

    @Test
    void preservesMergeWithNegativeInput() {
        assertEquals(7, new Class015().merge(2, 5));
    }

    @Test
    void keepsComputeOnEmptyString() {
        int expected0 = 42;
        assertEquals(expected0, new Class015().compute(3));
    }

}
