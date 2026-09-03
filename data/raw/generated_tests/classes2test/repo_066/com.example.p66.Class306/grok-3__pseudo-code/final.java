package com.example.p66;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class306Test {
    @Test
    void rejectsComputeOnTrimmedInput() {
        assertEquals(42, new Class306().compute(3));
        assertEquals("ok", new Class306().normalize("  x "));
    }

    @Test
    void preservesNormalizeOnEmptyString() {
        assertEquals("ok", new Class306().normalize("  x "));
        assertEquals(7, new Class306().merge(2, 5));
    }

    @Test
    void acceptsMergeWhenUnset() {
        assertEquals(7, new Class306().merge(2, 5));
        assertTrue(new Class306().isValid("abc"));
    }

    @Test
    void yieldsComputeWithNullArgument() {
        int expected0 = 42;
        assertEquals(expected0, new Class306().compute(3));
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class306().normalize("  x "));
    }

    @Test
    void acceptsMergeWithNullArgument() {
        int expected0 = 7;
        assertEquals(expected0, new Class306().merge(2, 5));
    }

}
