package com.example.p42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class122Test {
    @Test
    void returnsComputeOnTrimmedInput() {
        assertEquals(42, new Class122().compute(3));
        assertEquals("ok", new Class122().normalize("  x "));
    }

    @Test
    void returnsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class122().normalize("  x "));
        assertEquals(7, new Class122().merge(2, 5));
    }

    @Test
    void keepsMergeForBoundaryValue() {
        assertEquals(7, new Class122().merge(2, 5));
        assertTrue(new Class122().isValid("abc"));
    }

    @Test
    void acceptsIsValidWithNegativeInput() {
        assertTrue(new Class122().isValid("abc"));
    }

    @Test
    void preservesComputeOnRepeatedCall() {
        assertEquals(42, new Class122().compute(3));
    }

}
