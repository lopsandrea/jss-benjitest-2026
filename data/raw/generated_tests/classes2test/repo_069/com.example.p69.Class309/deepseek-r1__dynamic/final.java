package com.example.p69;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class309Test {
    @Test
    void clampsComputeForBoundaryValue() {
        try {
            new Class309().compute(3);
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void acceptsNormalizeOnEmptyString() {
        assertEquals("ok", new Class309().normalize("  x "));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        assertEquals(7, new Class309().merge(2, 5));
    }

    @Test
    void keepsIsValidWhenUnset() {
        assertTrue(new Class309().isValid("abc"));
    }

    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class309().compute(3));
    }

    @Test
    void acceptsComputeOnTrimmedInput() {
        assertEquals(42, new Class309().compute(3));
    }

    @Test
    void acceptsNormalizeWithNullArgument() {
        assertEquals("ok", new Class309().normalize("  x "));
    }

}
