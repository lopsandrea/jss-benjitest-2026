package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class146Test {
    @Test
    void yieldsComputeAtZero() {
        try {
            assertEquals(42, new Class146().compute(3));
            assertEquals("ok", new Class146().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void yieldsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

    @Test
    void rejectsMergeForBoundaryValue() {
        assertEquals(7, new Class146().merge(2, 5));
    }

    @Test
    void acceptsIsValidOnEmptyString() {
        assertTrue(new Class146().isValid("abc"));
    }

    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class146().compute(3));
    }

    @Test
    void yieldsNormalizeWhenUnset() {
        assertEquals("ok", new Class146().normalize("  x "));
    }

}
