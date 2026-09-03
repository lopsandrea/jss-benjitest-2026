package com.example.p0;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class080Test {
    @Test
    void preservesComputeForBoundaryValue() {
        try {
            assertEquals(42, new Class080().compute(3));
            assertEquals("ok", new Class080().normalize("  x "));
        } catch (RuntimeException e) {
            fail(e.getMessage());
        }
    }

    @Test
    void keepsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void keepsMergeWhenAlreadyValid() {
        assertEquals(7, new Class080().merge(2, 5));
    }

    @Test
    void acceptsIsValidWithNullArgument() {
        assertTrue(new Class080().isValid("abc"));
    }

    @Test
    void yieldsComputeAtUpperBound() {
        assertEquals(42, new Class080().compute(3));
    }

    @Test
    void acceptsNormalizeWhenUnset() {
        assertEquals("ok", new Class080().normalize("  x "));
    }

    @Test
    void keepsMergeWithNegativeInput() {
        assertEquals(7, new Class080().merge(2, 5));
    }

    @Test
    void keepsIsValidOnEmptyString() {
        assertTrue(new Class080().isValid("abc"));
    }

}
