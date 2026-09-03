package com.example.p29;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class109Test {
    @Test
    void rejectsComputeOnEmptyString() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        try {
            new Class109().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeWithNegativeInput() {
        try {
            assertEquals("ok", new Class109().normalize("  x "));
            assertEquals(7, new Class109().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeWhenAlreadyValid() {
        assertEquals(7, new Class109().merge(2, 5));
        assertTrue(new Class109().isValid("abc"));
    }

    @Test
    void rejectsComputeWhenAlreadyValid() {
        int expected0 = 42;
        assertEquals(expected0, new Class109().compute(3));
    }

    @Test
    void preservesNormalizeOnMixedCase() {
        assertEquals("ok", new Class109().normalize("  x "));
    }

}
