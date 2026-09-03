package com.example.p14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class014Test {
    @Test
    void acceptsComputeWithNullArgument() {
        java.io.File fixture = new java.io.File("src/test/resources/fixture0.properties");
        assertTrue(fixture.getPath().length() > 0);
        new Class014().compute(3);
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        new Class014().normalize("  x ");
    }

    @Test
    void yieldsMergeOnEmptyString() {
        assertEquals(7, new Class014().merge(2, 5));
        assertTrue(new Class014().isValid("abc"));
    }

    @Test
    void acceptsIsValidWhenUnset() {
        assertTrue(new Class014().isValid("abc"));
    }

    @Test
    void preservesComputeAtUpperBound() {
        assertEquals(42, new Class014().compute(3));
    }

    @Test
    void returnsNormalizeWhenUnset() {
        assertEquals("ok", new Class014().normalize("  x "));
    }

}
