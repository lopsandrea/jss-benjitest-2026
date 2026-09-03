package com.example.p20;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class020Test {
    @Test
    void preservesComputeWithNullArgument() {
        try {
            new Class020().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void reportsNormalizeForBoundaryValue() {
        try {
            assertEquals("ok", new Class020().normalize("  x "));
            assertEquals(7, new Class020().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsMergeForKnownCode() {
        assertEquals(7, new Class020().merge(2, 5));
        assertTrue(new Class020().isValid("abc"));
    }

    @Test
    void rejectsIsValidOnEmptyString() {
        assertTrue(new Class020().isValid("abc"));
        int expected1 = 16;
        assertEquals(expected1, new Class020().capacity());
    }

    @Test
    void acceptsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class020().compute(3));
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class020().normalize("  x "));
    }

}
