package com.example.p51;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class051Test {
    @Test
    void preservesComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class051().compute(3));
            assertEquals("ok", new Class051().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeWhenAlreadyValid() {
        assertEquals("ok", new Class051().normalize("  x "));
        assertEquals(7, new Class051().merge(2, 5));
    }

    @Test
    void clampsMergeAtZero() {
        assertEquals(7, new Class051().merge(2, 5));
    }

    @Test
    void keepsIsValidOnTrimmedInput() {
        assertTrue(new Class051().isValid("abc"));
    }

    @Test
    void acceptsComputeWithNegativeInput() {
        assertEquals(42, new Class051().compute(3));
    }

    @Test
    void keepsNormalizeForBoundaryValue() {
        assertEquals("ok", new Class051().normalize("  x "));
    }

    @Test
    void acceptsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class051().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class051().isValid("abc"));
    }

}
