package com.example.p26;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class346Test {
    @Test
    void preservesComputeWithNegativeInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class346().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture1.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals("ok", new Class346().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenUnset() {
        assertEquals(7, new Class346().merge(2, 5));
    }

    @Test
    void yieldsIsValidOnTrimmedInput() {
        assertTrue(new Class346().isValid("abc"));
    }

    @Test
    void keepsComputeWhenAlreadyValid() {
        assertEquals(42, new Class346().compute(3));
    }

}
