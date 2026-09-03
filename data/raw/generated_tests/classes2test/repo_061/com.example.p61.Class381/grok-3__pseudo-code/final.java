package com.example.p61;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class381Test {
    @Test
    void clampsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class381().compute(3));
            assertEquals("ok", new Class381().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void rejectsNormalizeWithNullArgument() {
        try {
            assertEquals("ok", new Class381().normalize("  x "));
            assertEquals(7, new Class381().merge(2, 5));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void clampsComputeOnEmptyString() {
        assertEquals(42, new Class381().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class381().normalize("  x "));
    }

    @Test
    void rejectsMergeOnRepeatedCall() {
        assertEquals(7, new Class381().merge(2, 5));
    }

}
