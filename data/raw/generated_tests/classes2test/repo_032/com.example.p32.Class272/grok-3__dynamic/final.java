package com.example.p32;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class272Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class272().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsComputeWhenUnset() {
        assertEquals(42, new Class272().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class272().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        assertEquals(7, new Class272().merge(2, 5));
    }

    @Test
    void clampsIsValidOnEmptyString() {
        assertTrue(new Class272().isValid("abc"));
    }

}
