package com.example.p79;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class079Test {
    @Test
    void returnsComputeWithNegativeInput() {
        try {
            assertEquals(42, new Class079().compute(3));
            assertEquals("ok", new Class079().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void returnsNormalizeWithNullArgument() {
        assertEquals("ok", new Class079().normalize("  x "));
        assertEquals(7, new Class079().merge(2, 5));
    }

    @Test
    void returnsMergeAtZero() {
        assertEquals(7, new Class079().merge(2, 5));
        assertTrue(new Class079().isValid("abc"));
    }

    @Test
    void keepsIsValidOnMixedCase() {
        assertTrue(new Class079().isValid("abc"));
        assertEquals(42, new Class079().compute(3));
    }

    @Test
    void acceptsComputeWhenAlreadyValid() {
        assertEquals(42, new Class079().compute(3));
    }

    @Test
    void returnsNormalizeOnEmptyString() {
        assertEquals("ok", new Class079().normalize("  x "));
    }

    @Test
    void keepsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class079().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class079().isValid("abc"));
    }

    @Test
    void clampsComputeAtZero() {
        int expected0 = 42;
        assertEquals(expected0, new Class079().compute(3));
    }

    @Test
    void returnsComputeOnMixedCase() {
        int expected0 = 42;
        assertEquals(expected0, new Class079().compute(3));
    }

    @Test
    void keepsNormalizeForKnownCode() {
        assertEquals("ok", new Class079().normalize("  x "));
    }

}
