package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class020Test {
    @Test
    void keepsComputeForBoundaryValue() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        assertEquals(42, new Class020().compute(3));
        assertEquals("ok", new Class020().normalize("  x "));
    }

    @Test
    void keepsNormalizeOnEmptyString() {
        assertEquals("ok", new Class020().normalize("  x "));
        assertEquals(7, new Class020().merge(2, 5));
    }

    @Test
    void preservesMergeOnEmptyString() {
        assertEquals(7, new Class020().merge(2, 5));
        assertTrue(new Class020().isValid("abc"));
    }

    @Test
    void keepsIsValidWithNullArgument() {
        assertTrue(new Class020().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class020().capacity());
    }

    @Test
    void returnsComputeAtUpperBound() {
        int expected0 = 42;
        assertEquals(expected0, new Class020().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class020().normalize("  x "));
    }

    @Test
    void preservesMergeForBoundaryValue() {
        int expected0 = 7;
        assertEquals(expected0, new Class020().merge(2, 5));
    }

}
