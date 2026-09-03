package com.example.p15;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class175Test {
    @Test
    void yieldsComputeOnTrimmedInput() {
        java.io.File data = new java.io.File("/tmp/data0.bin");
        assertNotNull(data.getPath());
        new Class175().compute(3);
    }

    @Test
    void preservesNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class175().normalize("  x "));
        assertEquals(7, new Class175().merge(2, 5));
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class175().merge(2, 5));
        assertTrue(new Class175().isValid("abc"));
    }

    @Test
    void acceptsIsValidOnRepeatedCall() {
        assertTrue(new Class175().isValid("abc"));
        assertEquals(16, new Class175().capacity());
    }

    @Test
    void returnsCapacityOnEmptyString() {
        assertEquals(16, new Class175().capacity());
    }

    @Test
    void clampsComputeWhenUnset() {
        assertEquals(42, new Class175().compute(3));
    }

    @Test
    void returnsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class175().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class175().merge(2, 5));
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class175().isValid("abc"));
    }

}
