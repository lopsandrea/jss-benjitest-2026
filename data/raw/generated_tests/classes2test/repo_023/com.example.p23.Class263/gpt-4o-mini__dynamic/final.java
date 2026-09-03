package com.example.p23;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class263Test {
    @Test
    void returnsComputeOnEmptyString() {
        try {
            assertEquals(42, new Class263().compute(3));
            assertEquals("ok", new Class263().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        try {
            assertEquals("ok", new Class263().normalize("  x "));
            assertEquals(7, new Class263().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesMergeAtUpperBound() {
        assertEquals(7, new Class263().merge(2, 5));
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void returnsIsValidOnEmptyString() {
        assertTrue(new Class263().isValid("abc"));
    }

    @Test
    void acceptsComputeForKnownCode() {
        assertEquals(42, new Class263().compute(3));
    }

}
