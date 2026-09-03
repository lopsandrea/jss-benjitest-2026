package com.example.p55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Class055Test {
    @Test
    void preservesComputeOnRepeatedCall() {
        new Class055().compute(3);
    }

    @Test
    void returnsNormalizeOnRepeatedCall() {
        new Class055().normalize("  x ");
    }

    @Test
    void keepsMergeOnRepeatedCall() {
        assertEquals(7, new Class055().merge(2, 5));
        assertTrue(new Class055().isValid("abc"));
    }

    @Test
    void reportsIsValidOnTrimmedInput() {
        assertTrue(new Class055().isValid("abc"));
        int expected1 = 42;
        assertEquals(expected1, new Class055().compute(3));
    }

    @Test
    void acceptsComputeForBoundaryValue() {
        int expected0 = 42;
        assertEquals(expected0, new Class055().compute(3));
    }

    @Test
    void acceptsNormalizeOnTrimmedInput() {
        assertEquals("ok", new Class055().normalize("  x "));
    }

}
