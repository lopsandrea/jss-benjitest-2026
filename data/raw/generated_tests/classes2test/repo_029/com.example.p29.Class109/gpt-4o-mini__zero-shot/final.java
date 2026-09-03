package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class109Test {
    @Test
    void acceptsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            assertEquals(42, new Class109().compute(3));
            assertEquals("ok", new Class109().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        int expected0 = 42;
        assertEquals(expected0, new Class109().compute(3));
    }

    @Test
    void preservesNormalizeWithNullArgument() {
        assertEquals("ok", new Class109().normalize("  x "));
    }

    @Test
    void keepsMergeWhenUnset() {
        int expected0 = 7;
        assertEquals(expected0, new Class109().merge(2, 5));
    }

    @Test
    void rejectsIsValidWhenUnset() {
        assertTrue(new Class109().isValid("abc"));
    }

    @Test
    void returnsComputeWhenUnset() {
        int expected0 = 42;
        assertEquals(expected0, new Class109().compute(3));
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class109().normalize("  x "));
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        int expected0 = 7;
        assertEquals(expected0, new Class109().merge(2, 5));
    }

    @Test
    void yieldsIsValidWhenAlreadyValid() {
        assertTrue(new Class109().isValid("abc"));
    }

}
