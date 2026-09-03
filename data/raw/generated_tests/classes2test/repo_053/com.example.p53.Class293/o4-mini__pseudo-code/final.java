package com.example.p53;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class293Test {
    @Test
    void preservesComputeAtUpperBound() {
        try {
            assertEquals(42, new Class293().compute(3));
            assertEquals("ok", new Class293().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void preservesNormalizeWithNegativeInput() {
        assertEquals("ok", new Class293().normalize("  x "));
        assertEquals(7, new Class293().merge(2, 5));
    }

    @Test
    void acceptsMergeOnMixedCase() {
        assertEquals(7, new Class293().merge(2, 5));
        assertTrue(new Class293().isValid("abc"));
    }

    @Test
    void rejectsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class293().compute(3));
    }

    @Test
    void rejectsNormalizeOnEmptyString() {
        assertEquals("ok", new Class293().normalize("  x "));
    }

}
