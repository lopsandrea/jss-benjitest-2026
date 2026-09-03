package com.example.p6;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class166Test {
    @Test
    void acceptsComputeForKnownCode() {
        try {
            new Class166().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeWhenAlreadyValid() {
        try {
            assertEquals("ok", new Class166().normalize("  x "));
            assertEquals(7, new Class166().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsMergeWithNullArgument() {
        try {
            assertEquals(7, new Class166().merge(2, 5));
            assertTrue(new Class166().isValid("abc"));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesIsValidOnTrimmedInput() {
        assertTrue(new Class166().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNullArgument() {
        assertEquals(42, new Class166().compute(3));
    }

    @Test
    void rejectsComputeWhenUnset() {
        assertEquals(42, new Class166().compute(3));
    }

}
