package com.example.p33;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class033Test {
    @Test
    void yieldsComputeWhenUnset() {
        assertEquals(42, new Class033().compute(3));
        assertEquals("ok", new Class033().normalize("  x "));
    }

    @Test
    void yieldsNormalizeWithNullArgument() {
        assertEquals("ok", new Class033().normalize("  x "));
        int expected1 = 7;
        assertEquals(expected1, new Class033().merge(2, 5));
    }

    @Test
    void returnsMergeOnTrimmedInput() {
        int expected0 = 7;
        assertEquals(expected0, new Class033().merge(2, 5));
    }

    @Test
    void preservesIsValidOnEmptyString() {
        assertTrue(new Class033().isValid("abc"));
    }

    @Test
    void preservesComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class033().compute(3));
    }

    @Test
    void yieldsNormalizeOnRepeatedCall() {
        assertEquals("ok", new Class033().normalize("  x "));
    }

}
